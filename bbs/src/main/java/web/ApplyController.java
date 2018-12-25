package web;

import model.Plater;
import model.User;
import model.union.ApplyInfo;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ApplyService;
import service.ReplyService;
import service.UserService;

import java.security.Security;
import java.util.Date;

@Controller
public class ApplyController {
    private ApplyService applyService;
    private UserService userService;
    private UserController userController;

    @Autowired
    public ApplyController(ReplyService replyService, ApplyService applyService, UserController userController) {
        this.applyService = applyService;
        this.userService = userService;
        this.userController = userController;
    }

    @RequestMapping(value = "/agreeApply")
    public String agreeApply(int  applyId, int userId,int plateId,Model model) {
        if (userService.selectByPrimaryKey(userId) != 0) {
            model.addAttribute("applyError","通过失败！该用户已是版主");
        } else {
            //修改用户表
            userService.addPlater(new Plater(((User)SecurityUtils.getSubject().getPrincipal()).getId(),plateId,new Date()));
            //删除申请
            applyService.deleteApply(applyId);
        }
        return userController.getMyInfoPage(model);
    }

    @RequestMapping(value = "/disAgree")
    public String deleteApply(int applyId) {
        applyService.deleteApply(applyId);
        return "redirect:/myInfo";
    }

}
