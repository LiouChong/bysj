package dao;

import java.util.List;
import model.FavoritesArticle;
import model.FavoritesArticleExample;
import org.apache.ibatis.annotations.Param;

public interface FavoritesArticleMapper {
    long countByExample(FavoritesArticleExample example);

    int deleteByExample(FavoritesArticleExample example);

    int insert(FavoritesArticle record);

    int insertSelective(FavoritesArticle record);

    List<FavoritesArticle> selectByExample(FavoritesArticleExample example);

    int updateByExampleSelective(@Param("record") FavoritesArticle record, @Param("example") FavoritesArticleExample example);

    int updateByExample(@Param("record") FavoritesArticle record, @Param("example") FavoritesArticleExample example);
}