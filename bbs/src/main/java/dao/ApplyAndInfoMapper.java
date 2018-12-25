package dao;

import model.union.ApplyInfo;

import java.util.List;

/**
 * 查看博主申请信息
 */
public interface ApplyAndInfoMapper {
    List<ApplyInfo> selectAllInfo();
}
