package service;

import model.union.ApplyInfo;

import java.util.List;

public interface ApplyService {
    List<ApplyInfo> selectAllInfo();
    int deleteApply(int applyId);
}
