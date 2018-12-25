package service;

import model.Plate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlateService {
    List<Plate> getAllPlates();
    Integer selectIdByName(String plateName);
}
