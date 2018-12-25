package dao.extend;

import dao.PlateMapper;
import model.Plate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlateMapperExtends extends PlateMapper {
    int updateByPrimaryKey(Plate record);

    List<Plate> getAllPlate();

    Integer selectByPlateName(@Param("plateName") String plateName);

    int updateByPrimaryKeySelective(Plate record);
}
