package web;

import model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.ApplyService;
import service.FollowService;
import service.UserService;
import util.MailUtil;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

@Controller
public class UserController {

    private UserService userService;
    private FollowService followService;
    private ApplyService applyService;

    @Autowired
    public UserController(UserService userService, FollowService followService, ApplyService applyService) {
        this.userService = userService;
        this.followService = followService;
        this.applyService = applyService;
    }

    @GetMapping(value = "/login")
    public String getloginJSP() {
        return "login";
    }

    @PostMapping(value = "/checkName", produces = "text/html;charset=UTF-8" )
    public void checkIfNameRepeated(
            String email,
            HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        //向页面ajax输出值
        PrintWriter out = response.getWriter();
        if (userService.ifNameRepeat(email) !=null) {
            out.print("该邮箱已被注册！");
        } else {
            out.print("");
        }
        out.flush();
        out.close();
    }

    @GetMapping(value = "/sendMail")
    public void sendVerificationCode(@RequestParam("mail") String email, HttpServletRequest request, HttpServletResponse response) throws IOException {
        int verificationCode  = new Random().nextInt(10000);
        if (verificationCode < 1000)
            verificationCode += 1000;

        HttpSession session = request.getSession();
        //将随机生成的验证码保存到session中，便于后面取出对比
        session.setAttribute("verificationCode",verificationCode);
        session.setAttribute("email",email);
        try {
            MailUtil.senMail(verificationCode,email);
        } catch (Exception e) {
            e.printStackTrace();
        }

        PrintWriter out = response.getWriter();
        out.print("success");
        out.flush();
        out.close();
    }
    /**
     * 有个疑问，如何把email和psw直接注入到user，如果直接注入就报错415.
     * @throws IOException
     */
    @PostMapping(value = "/regist")
    public void getRegist(User user, String code,
            HttpServletResponse response,
            HttpServletRequest request) throws IOException {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        if (session.getAttribute("email")==null) {
            out.print("请先发送验证码");
            return;
        }
        if (!(session.getAttribute("email").equals(user.getEmail()))) {
            out.print("不要调皮!");
            return;
        }
        if(userService.ifNameRepeat(user.getEmail()) != null) {
            out.print("打死也不看红字!");
            return;
        }


        //取出发送邮件时的验证码
        int verificationCode = (int) session.getAttribute("verificationCode");
        //session的验证码和前端传入的输入值比较。不同则返回验证码错误
        if (! ((verificationCode+"").equals(code)) )
            out.print("验证码错误！");
        else {
            if (userService.addUser(user) == 1)
                out.print("注册成功");
            else
                out.print("注册失败！，请稍后再试");

            out.flush();
            out.close();
        }
    }


    @PostMapping(value = "/login")
    public String getLogin(HttpServletRequest request, Model model) {
        //如果登陆失败，从request中获取认证异常消息，shiroLoginFailture即使shiro异常类的全限定名
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
        System.out.println(exceptionClassName);
        if (exceptionClassName != null) {
            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                //最总会抛给异常处理器
                model.addAttribute("login_info","账号不存在");
            } else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
                model.addAttribute("login_info","用户名/密码错误");
            } else {
                model.addAttribute("login_info","其他异常信息");
            }

        }
        //此方法不处理登陆成功，shiro认证成功会跳转到上一个请求路径。
        //登录失败回到login界面
        return "login";




      /*  if (email.equals("") || psw.equals("")) {
           model.addAttribute("login_info","用户名或密码为空！");
           return "login";
        } else {
            if (userService.ifNameRepeat(email) == null) {
                model.addAttribute("login_info", "该用户名尚未被注册");
                return "login";
            }
            else if(!(userService.ifNameRepeat(email).getPsw().equals(psw))) {
                model.addAttribute("login_info","密码错误！");
                return "login";
            }
            else {
                HttpSession session = request.getSession();
                session.setAttribute("email", user.getEmail());
                model.addAttribute("login_info","登陆成功！");
            }
        }
        return "index-2";*/
    }

    @RequestMapping(value = "/myInfo")
    public String getMyInfoPage(Model model) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        int count = followService.selectfanCountByStarId(user.getId());
        model.addAttribute("user",userService.selectUserAndPlateById(user.getId()));
        model.addAttribute("count",count);
        model.addAttribute("applys",applyService.selectAllInfo());
        return "myInfo";
    }

    @RequestMapping(value = "/submitPic" ,method = RequestMethod.POST)
    public String sumitpic(@RequestPart("file")Part profilePicture,Model model) throws IOException {
        //Part写入文件,或者用MultipartFile
//        profilePicture.transferTo(new File("路径")); 但是要传入MultiPartFile
        if (profilePicture.getSize() > 2097152)
            model.addAttribute("超出图片大小限制！");
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        profilePicture.write(user.getEmail()+profilePicture.getSubmittedFileName());

        user.setPicture(user.getEmail()+profilePicture.getSubmittedFileName());
        if (userService.updateUser(user) != 1)
            model.addAttribute("info","更新失败，从稍后再试！");

        return "redirect:/myInfo";
    }

    @RequestMapping(value = "/changeInfo", method = RequestMethod.POST)
    public String changeInfo(String nickname, String psw, Model model) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        if (!(nickname.equals("")))
            user.setNickname(nickname);
        if (!(psw.equals("")))
            user.setPsw(psw);
        userService.updateUser(user);
        return getMyInfoPage(model);
    }

}
