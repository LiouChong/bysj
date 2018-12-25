package dao;

import java.util.List;
import model.UserTeamRel;
import model.UserTeamRelExample;
import org.apache.ibatis.annotations.Param;

public interface UserTeamRelMapper {
    long countByExample(UserTeamRelExample example);

    int deleteByExample(UserTeamRelExample example);

    int insert(UserTeamRel record);

    int insertSelective(UserTeamRel record);

    List<UserTeamRel> selectByExample(UserTeamRelExample example);

    int updateByExampleSelective(@Param("record") UserTeamRel record, @Param("example") UserTeamRelExample example);

    int updateByExample(@Param("record") UserTeamRel record, @Param("example") UserTeamRelExample example);
}