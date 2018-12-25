package service.impl;

import dao.PlateMapper;
import dao.extend.PlateMapperExtends;
import model.Plate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PlateService;

import java.util.List;

@Service
public class PlateServiceImpl implements PlateService {

    private PlateMapperExtends plateMapperExtends;

    @Autowired
    public  PlateServiceImpl(PlateMapperExtends plateMapperExtends) {
        this.plateMapperExtends = plateMapperExtends;
    }

    public List<Plate> getAllPlates() {
        return plateMapperExtends.getAllPlate();
    }

    @Override
    public Integer selectIdByName(String plateName) {
        return plateMapperExtends.selectByPlateName(plateName);
    }


}
