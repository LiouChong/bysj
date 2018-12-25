package service.impl;

import dao.PostAndPlateMapper;
import dao.PostMapper;
import dao.extend.PostMapperExtends;
import model.Post;
import model.union.PostAndPlate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PostService;

import java.util.List;

@Service
public class PostServiceimpl implements PostService {

    private PostMapperExtends postMapperExtends;
    private PostAndPlateMapper postAndPlateMapper;

    @Autowired
    public PostServiceimpl(PostMapperExtends postMapperExtends, PostAndPlateMapper postAndPlateMapper) {
        this.postMapperExtends = postMapperExtends;
        this.postAndPlateMapper = postAndPlateMapper;
    }


    @Override
    public int addPost(Post post) {
        return postMapperExtends.insertSelective(post);
    }

    @Override
    public List<PostAndPlate> selectAllGoodPost(int limit,int startIndex) {
        return postAndPlateMapper.selectAllGoodPost(limit,startIndex);
    }

    @Override
    public Post selectById(int id) {
        return postMapperExtends.selectByPrimaryKey(id);
    }

    @Override
    public PostAndPlate selectPostAndPlateById(int id) {
        return postAndPlateMapper.selectPostAndPlateById(id);
    }

    @Override
    public int selectGoodPostCount() {
        return postMapperExtends.selectGoodPostCount();
    }

    @Override
    public List<PostAndPlate> selectAllPostLimit(int startIndex, int limit) {
        return postAndPlateMapper.selectAllPostLimit(startIndex,limit);
    }

    @Override
    public int selectPostCount() {
        return postMapperExtends.selectPostCount();
    }

    @Override
    public int deleteById(int id) {
        return postMapperExtends.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Post post) {
        return postMapperExtends.updateByPrimaryKeySelective(post);
    }

    @Override
    public Post selectPostById(int postId) {
        return postMapperExtends.selectByPrimaryKey(postId);
    }

    @Override
    public int setReplyCountReduce1(int id) {
        return postMapperExtends.setReplyCountReduce1(id);
    }

    @Override
    public List<PostAndPlate> selectPostByKeyWord(String serach,int startIndex, int limit) {
        return postAndPlateMapper.selectPostByKeyWord(serach,startIndex,limit);
    }
}
