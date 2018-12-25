package dao.extend;

import dao.UserMapper;
import model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapperExtends extends UserMapper {
    User selectByemail(@Param("email") String email);
    List<String> selectUserPermissionBylevel(@Param("level") int level);
}
