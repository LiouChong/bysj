package dao;

import java.util.List;
import model.Applyplate;
import model.ApplyplateExample;
import org.apache.ibatis.annotations.Param;

public interface ApplyplateMapper {
    long countByExample(ApplyplateExample example);

    int deleteByExample(ApplyplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Applyplate record);

    int insertSelective(Applyplate record);

    List<Applyplate> selectByExample(ApplyplateExample example);

    Applyplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Applyplate record, @Param("example") ApplyplateExample example);

    int updateByExample(@Param("record") Applyplate record, @Param("example") ApplyplateExample example);

    int updateByPrimaryKeySelective(Applyplate record);

    int updateByPrimaryKey(Applyplate record);
}