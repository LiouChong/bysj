package service.impl;

import dao.ReplyAndUserMapper;
import dao.ReplyMapper;
import dao.extend.ReplyMapperExtends;
import model.Post;
import model.Reply;
import model.union.ReplyAndUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ReplyService;

import java.util.List;

@Service
public class ReplyServiceimpl implements ReplyService {
    private ReplyMapperExtends replyMapperExtends;
    private ReplyAndUserMapper replyAndUserMapper;

    @Autowired
    public ReplyServiceimpl(ReplyMapperExtends replyMapperExtends,ReplyAndUserMapper replyAndUserMapper) {
        this.replyAndUserMapper = replyAndUserMapper;
        this.replyMapperExtends = replyMapperExtends;
    }


    @Override
    public int addReply(Reply reply) {
        return replyMapperExtends.insertSelective(reply);
    }

    @Override
    public List<ReplyAndUser> getReplyByPostId(int postId) {
        return replyAndUserMapper.selectReplyAndUserById(postId);
    }

    @Override
    public int setDeleteByReplyId(int replyId) {
        return replyMapperExtends.setDeleteByReplyId(replyId);
    }

    @Override
    public int setDeleteByPostId(int postId) {
        return replyMapperExtends.setDeleteByReplyId(postId);
    }
}
