package dao.extend;

import dao.ReplyMapper;

public interface ReplyMapperExtends extends ReplyMapper {
    int setDeleteByReplyId(int id);
}
