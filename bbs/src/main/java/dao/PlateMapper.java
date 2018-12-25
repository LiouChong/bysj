package dao;

import java.util.List;
import model.Plate;
import model.PlateExample;
import org.apache.ibatis.annotations.Param;

public interface PlateMapper {
    long countByExample(PlateExample example);

    int deleteByExample(PlateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Plate record);

    int insertSelective(Plate record);

    List<Plate> selectByExample(PlateExample example);

    Plate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Plate record, @Param("example") PlateExample example);

    int updateByExample(@Param("record") Plate record, @Param("example") PlateExample example);

    int updateByPrimaryKeySelective(Plate record);

    int updateByPrimaryKey(Plate record);
}