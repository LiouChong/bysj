package service.impl;

import dao.UserAndPlateMapper;
import dao.UserMapper;
import dao.extend.PlaterMapperExtends;
import dao.extend.UserMapperExtends;
import model.Plater;
import model.User;
import model.union.UserAndPlate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserMapperExtends userMapperExtends;
    private UserAndPlateMapper userAndPlateMapper;
    private PlaterMapperExtends platerMapperExtends;
    @Autowired
    public UserServiceImpl(UserMapperExtends userMapperExtends, UserAndPlateMapper userAndPlateMapper, PlaterMapperExtends platerMapperExtends) {
        this.userMapperExtends = userMapperExtends;
        this.userAndPlateMapper = userAndPlateMapper;
        this.platerMapperExtends = platerMapperExtends;
    }

    public User ifNameRepeat(String email) {
        return userMapperExtends.selectByemail(email);
    }

    public int addUser(User user) {
        return userMapperExtends.insertSelective(user);
    }

    @Override
    public Integer selectByPrimaryKey(int id) {
        return platerMapperExtends.booleanPlater(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapperExtends.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<String> selectUserPermissionBylevel(int id) {
        return userMapperExtends.selectUserPermissionBylevel(id);
    }

    @Override
    public UserAndPlate selectUserAndPlateById(int id) {
        return userAndPlateMapper.selectUserAndPlateById(id);
    }

    @Override
    public Integer addPlater(Plater plater) {
        return platerMapperExtends.insert(plater);
    }
}
