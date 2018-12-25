package web;

import com.sun.org.apache.xpath.internal.operations.Mod;
import model.Plate;
import model.Post;
import model.Reply;
import model.User;
import model.fenye.Page;
import model.union.PostAndPlate;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.PlateService;
import service.PostService;
import service.ReplyService;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class PostController {

    private PlateService plateService;
    private PostService postService;
    private Post post;
    private ReplyService replyService;
    private UserService userService;

    @Autowired
    public PostController(PlateService plateService, PostService postService,Post post, ReplyService replyService, UserService userService) {
        this.plateService = plateService;
        this.postService = postService;
        this.post = post;
        this.replyService = replyService;
        this.userService = userService;
    }

    //跳转到添加帖子页面
    @RequestMapping(value = "/getPostPage")
    @RequiresPermissions("post:add")
    public String getAddPostPage(Model model) {
        List<Plate> plates = plateService.getAllPlates();
        model.addAttribute("plates",plates);
        return "addPost";
    }


  /*  //发表帖子
    @PostMapping(value="newPost")
    public String newPost(String title,String info,String plateId,Model model) {
        System.out.println("title" + title + "   info " + info );
        int plateId2 = plateService.selectIdByName(plateId);
        System.out.println(plateId2);
        post.setTitle(title);
        post.setInfo(info);
        post.setPlateId(plateId2);
        post.setTime(new Date());
        post.setPosterId(((User) SecurityUtils.getSubject().getPrincipal()).getId());
        if (postService.addPost(post) ==1) {
            model.addAttribute("msg","发表成功！");
            return getIndex_2Page(1,model);
        }
        model.addAttribute("msg","服务器异常！请稍后再试！");
        return "index-2";
    }*/

    //获取首页页面
    @RequestMapping(value = "/index-2",method = RequestMethod.GET)
    public String getIndex_2Page(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum, Model model) {
        Page page = new Page(pageNum);
        int maxPageNum = postService.selectGoodPostCount();
        page.setPostCount(maxPageNum);
        model.addAttribute("page",page);
        List<PostAndPlate> postAndPlates = postService.selectAllGoodPost(5,page.getStartIndex());
        model.addAttribute("postAndPlateList",postAndPlates);
        return "index-2";
    }

    //根据帖子id找到帖子详情页面
    @GetMapping(value = "/articles-list/{postId}")
    public String getPostById(@PathVariable int postId,Model model) {
        PostAndPlate postAndPlate = postService.selectPostAndPlateById(postId);
        model.addAttribute("postAndPlate",postAndPlate);
        model.addAttribute("ReplyAndUsers",replyService.getReplyByPostId(postId));
        return "single";
    }

    @RequestMapping(value = "/articles-list")
    public String getArticleListPage(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum, Model model) {
        Page page = new Page(10,pageNum);
        page.setPostCount(postService.selectPostCount());
        List<PostAndPlate> postAndPlates = postService.selectAllPostLimit(page.getStartIndex(),10);
        model.addAttribute("postAndPlates",postAndPlates);
        model.addAttribute("page",page);
        return "articles-list";
    }

    @RequestMapping(value = "/deletePost" )
    @RequiresPermissions(value = "post:delete")
    public String deletePost(int postId,int pageNum) {
        postService.deleteById(postId);
        replyService.setDeleteByPostId(postId);
        return "redirect:/articles-list?pageNum="+ pageNum;

    }

    //将文章设置为推荐文章
    @RequestMapping(value = "/takeGoodPost")
    @RequiresPermissions(value = "post:good")
    public String takePostGood(int postId, int pageNum,Model model) {
        //这里感觉可以直接写一个mapper语句设值即可。
        post = postService.selectById(postId);
        post.setIfGood(1);
        postService.updateByPrimaryKeySelective(post);
        return getArticleListPage(pageNum,model);
    }

    @PostMapping(value = "/doReply")
    @RequiresPermissions("reply:add")
    public String doReply(Reply reply,int postId) {
        //设置reply
        reply.setReplyTime(new Date());
        reply.setUserId(((User) SecurityUtils.getSubject().getPrincipal()).getId());

        //添加reply
        replyService.addReply(reply);

        //设置post回复数
        post = postService.selectById(postId);
        post.setReplyCount(post.getReplyCount()+1);
        postService.updateByPrimaryKeySelective(post);

        return "redirect:/articles-list/" + postId;
    }


    /**
     * 三种情况下可以山回复：
     * 1.管理权限在2或者3  (permission>2)
     * 2.回复者本人  (reply.user_id = user.id)
     * 3.帖子的拥有着 (post.poster_id == user.id)
     *
     * @param replyId 回复id 删除数据库里信息的参数.
     * @param postId 帖子id
     * @param replyUserId 回复者id,用来判断这句回复是否为当前本人
     * @param posterId  发帖者,若为发帖子就可以删帖子
     * @return
     */
    @RequestMapping(value = "/deleteReply")
    public String deleteReply(int replyId,int postId,int replyUserId,int posterId) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();

        if (user.getLevel() > 1 || replyUserId == user.getId() || posterId == user.getId()) {
            //删除回复
            replyService.setDeleteByReplyId(replyId);
            //帖子回复数-1 s
            postService.setReplyCountReduce1(postId);
            return "redirect:/articles-list/" + postId;
        } else {
            return "nopermission";
        }


    }

    @RequestMapping(value = "/searchInfo")
    public String getPostByInfo(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,String search,Model model) {
        Page page = new Page(10,pageNum);

        List<PostAndPlate> postAndPlates = postService.selectPostByKeyWord(search,(pageNum-1) * 10,10);
        model.addAttribute("postAndPlates",postAndPlates);
        page.setPostCount(postAndPlates.size());
        model.addAttribute("page",page);
        model.addAttribute("searchInfo",search);
        return "searchResult";
    }

    @RequestMapping(value = "/good/{id}")
    @ResponseBody
    public String getGoodPostBtId(@PathVariable String id) {
        System.out.println("aaaaaaaaaaaaa");
        return id;
    }
}
