package dao;

import model.union.UserAndPlate;
import org.apache.ibatis.annotations.Param;

public interface UserAndPlateMapper {
    UserAndPlate selectUserAndPlateById(@Param("id") int id);
}
