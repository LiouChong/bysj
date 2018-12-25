package dao.extend;

import dao.PostMapper;
import model.Post;

public interface PostMapperExtends extends PostMapper {
    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);

    int selectGoodPostCount();

    int selectPostCount();

    int setReplyCountReduce1(int id);
}
