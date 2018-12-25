package dao;

import java.util.List;
import model.TotalStationInformation;
import model.TotalStationInformationExample;
import org.apache.ibatis.annotations.Param;

public interface TotalStationInformationMapper {
    long countByExample(TotalStationInformationExample example);

    int deleteByExample(TotalStationInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TotalStationInformation record);

    int insertSelective(TotalStationInformation record);

    List<TotalStationInformation> selectByExample(TotalStationInformationExample example);

    TotalStationInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TotalStationInformation record, @Param("example") TotalStationInformationExample example);

    int updateByExample(@Param("record") TotalStationInformation record, @Param("example") TotalStationInformationExample example);

    int updateByPrimaryKeySelective(TotalStationInformation record);

    int updateByPrimaryKey(TotalStationInformation record);
}