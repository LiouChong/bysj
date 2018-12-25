import config.RootConfig;
import dao.*;
import dao.extend.PlateMapperExtends;
import dao.extend.PostMapperExtends;
import dao.extend.ReplyMapperExtends;
import dao.extend.UserMapperExtends;
import model.union.ApplyInfo;
import model.union.PostAndPlate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.FollowService;
import service.PostService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class TestRealm {
    @Autowired
    private ReplyMapper replyMapper;

    @Autowired
    private ReplyAndUserMapper replyAndUserMapper;
    @Test
    public void test1() {
        System.out.println(replyAndUserMapper.selectReplyAndUserById(1));
    }
    @Test
    public void test2() {
        System.out.println(replyMapper.selectByPrimaryKey(1));
    }

    @Autowired
    private UserAndPlateMapper userAndPlateMapper;
    @Test
    public void test3() {
        System.out.println(userAndPlateMapper.selectUserAndPlateById(11));
    }

    @Test
    public void test4() {
        System.out.println(replyMapper.deleteByPrimaryKey(10));
    }

    @Autowired
    private PostAndPlateMapper postAndPlateMapper;
    @Test
    public void test5(){
        List<PostAndPlate> postAndPlates = postAndPlateMapper.selectAllGoodPost(3, 0);

        for (int i = 0; i < postAndPlates.size(); i++) {
            System.out.println(postAndPlates.get(i).getTitle());
        }
    }


    @Autowired
    private PostService postService;
    @Test
    public void test8() {
        System.out.println(postService.setReplyCountReduce1(1));
    }

    @Autowired
    private ApplyAndInfoMapper applyAndInfoMapper;
    @Test
    public void test9() {
        List<ApplyInfo> applyInfos = applyAndInfoMapper.selectAllInfo();
        for (int i = 0; i < applyInfos.size(); i++) {
            System.out.println(applyInfos.get(i));
        }
    }

    @Test
    public void test11() {
        System.out.println(postAndPlateMapper.selectPostByKeyWord("线程",0,2));
    }

    @Autowired
    private FollowService followService;

    @Test
    public void test() {
        System.out.println(followService.selectfanCountByStarId(10));
        System.out.println("------------------------------------");
    }

    @Autowired
    private PlateMapperExtends plateMapperExtends;

    @Autowired
    private PostMapperExtends postMapperExtends;

    @Autowired
    private UserMapperExtends userMapperExtends;
    @Test
    public void testUser() {
        System.out.println("--------------------");
        System.out.println(userMapperExtends.selectUserPermissionBylevel(3));
        System.out.println("-----------------");
    }

    @Autowired
    private ReplyMapperExtends replyMapperExtends;

    @Test
    public void testreplt(){
        System.out.println(replyMapperExtends.setDeleteByReplyId(7));
    }

    @Test
    public void testpost() {
        System.out.println(postMapperExtends.selectGoodPostCount());
    }

    @Test
    public void testplate() {
        System.out.println(plateMapperExtends.selectByPlateName("云计算"));
    }
}
