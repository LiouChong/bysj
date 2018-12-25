package service;

import model.Plater;
import model.User;
import model.union.UserAndPlate;

import java.util.List;

public interface UserService {
    User ifNameRepeat(String email);
    int addUser(User user);
    Integer selectByPrimaryKey(int id);
    int updateUser(User user);
    List<String> selectUserPermissionBylevel(int id);
    UserAndPlate selectUserAndPlateById(int id);
    Integer addPlater(Plater plater);
}
