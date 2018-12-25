package dao;

import java.util.List;
import model.UserBan;
import model.UserBanExample;
import org.apache.ibatis.annotations.Param;

public interface UserBanMapper {
    long countByExample(UserBanExample example);

    int deleteByExample(UserBanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserBan record);

    int insertSelective(UserBan record);

    List<UserBan> selectByExample(UserBanExample example);

    UserBan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserBan record, @Param("example") UserBanExample example);

    int updateByExample(@Param("record") UserBan record, @Param("example") UserBanExample example);

    int updateByPrimaryKeySelective(UserBan record);

    int updateByPrimaryKey(UserBan record);
}