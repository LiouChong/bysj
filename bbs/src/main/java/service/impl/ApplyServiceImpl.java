package service.impl;

import dao.ApplyAndInfoMapper;
import dao.ApplyplateMapper;
import model.union.ApplyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ApplyService;

import java.util.List;
@Service
public class ApplyServiceImpl implements ApplyService {
    private ApplyAndInfoMapper applyAndInfoMapper;
    private ApplyplateMapper applyplateMapper;
    @Autowired
    public ApplyServiceImpl(ApplyAndInfoMapper applyAndInfoMapper, ApplyplateMapper applyplateMapper) {
        this.applyplateMapper = applyplateMapper;
        this.applyAndInfoMapper = applyAndInfoMapper;
    }

    @Override
    public List<ApplyInfo> selectAllInfo() {
        return applyAndInfoMapper.selectAllInfo();
    }

    @Override
    public int deleteApply(int applyId) {
        return applyplateMapper.deleteByPrimaryKey(applyId);
    }


}
