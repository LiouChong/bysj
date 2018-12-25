package dao;

import model.union.PostAndPlate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostAndPlateMapper {
    PostAndPlate selectPostAndPlateById(@Param("id") int id);
    List<PostAndPlate> selectAllGoodPost(@Param("limit")int limit,@Param("startIndex")int startIndex);
    List<PostAndPlate> selectAllPostLimit(@Param("startIndex")int startIndex,@Param("limit") int limit);
    List<PostAndPlate> selectPostByKeyWord(@Param("search") String search,@Param("startIndex")int startIndex,@Param("limit") int limit);
}
