package service.impl;

import dao.FollowMapper;
import dao.extend.FollowMapperExtends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.FollowService;

@Service
public class FollowServiceImpl implements FollowService {

    private FollowMapperExtends followMapperExtends;

    @Autowired
    public FollowServiceImpl(FollowMapperExtends followMapperExtends) {
        this.followMapperExtends = followMapperExtends;
    }

    @Override
    public int selectfanCountByStarId(int id) {
        return followMapperExtends.selectfanCountByStarId(id);
    }
}
