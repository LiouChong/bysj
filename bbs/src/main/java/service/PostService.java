package service;

import model.Post;
import model.union.PostAndPlate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostService {
    int addPost(Post post);
    List<PostAndPlate> selectAllGoodPost(int limit,int startIndex);
    Post selectById(int id);
    PostAndPlate selectPostAndPlateById(int id);
    int selectGoodPostCount();
    List<PostAndPlate> selectAllPostLimit(int startIndex, int limit);
    int selectPostCount();
    int deleteById(int id);
    int updateByPrimaryKeySelective(Post post);
    Post selectPostById(int postId);
    int setReplyCountReduce1(int id);

    List<PostAndPlate> selectPostByKeyWord(String serach,int startIndex, int limit);
}
