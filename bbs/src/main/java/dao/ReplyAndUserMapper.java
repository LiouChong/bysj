package dao;

import model.union.ReplyAndUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReplyAndUserMapper {
    List<ReplyAndUser> selectReplyAndUserById(int id);
}
