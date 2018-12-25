package service;

import model.Reply;
import model.union.ReplyAndUser;

import java.util.List;

public interface ReplyService {
    int addReply(Reply reply);
    List<ReplyAndUser> getReplyByPostId(int postId);
    int setDeleteByReplyId(int replyId);
    int setDeleteByPostId(int postId);
}
