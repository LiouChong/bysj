package dao;

import java.util.List;
import model.Follow;
import model.FollowExample;
import org.apache.ibatis.annotations.Param;

public interface FollowMapper {
    long countByExample(FollowExample example);

    int deleteByExample(FollowExample example);

    int insert(Follow record);

    int insertSelective(Follow record);

    List<Follow> selectByExample(FollowExample example);

    int updateByExampleSelective(@Param("record") Follow record, @Param("example") FollowExample example);

    int updateByExample(@Param("record") Follow record, @Param("example") FollowExample example);
}