package dao.extend;

import dao.FollowMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Primary;

public interface FollowMapperExtends extends FollowMapper {
    int selectfanCountByStarId(@Param("id") int id);
}
