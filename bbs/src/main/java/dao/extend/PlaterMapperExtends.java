package dao.extend;

import dao.PlaterMapper;
import org.apache.ibatis.annotations.Param;

public interface PlaterMapperExtends extends PlaterMapper {
    Integer booleanPlater(@Param("userId")int userId);
}
