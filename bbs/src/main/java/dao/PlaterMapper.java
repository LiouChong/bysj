package dao;

import java.util.List;
import model.Plater;
import model.PlaterExample;
import org.apache.ibatis.annotations.Param;

public interface PlaterMapper {
    long countByExample(PlaterExample example);

    int deleteByExample(PlaterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Plater record);

    int insertSelective(Plater record);

    List<Plater> selectByExample(PlaterExample example);

    Plater selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Plater record, @Param("example") PlaterExample example);

    int updateByExample(@Param("record") Plater record, @Param("example") PlaterExample example);

    int updateByPrimaryKeySelective(Plater record);

    int updateByPrimaryKey(Plater record);
}