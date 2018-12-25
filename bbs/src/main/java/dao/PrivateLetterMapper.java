package dao;

import java.util.List;
import model.PrivateLetter;
import model.PrivateLetterExample;
import org.apache.ibatis.annotations.Param;

public interface PrivateLetterMapper {
    long countByExample(PrivateLetterExample example);

    int deleteByExample(PrivateLetterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PrivateLetter record);

    int insertSelective(PrivateLetter record);

    List<PrivateLetter> selectByExample(PrivateLetterExample example);

    PrivateLetter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PrivateLetter record, @Param("example") PrivateLetterExample example);

    int updateByExample(@Param("record") PrivateLetter record, @Param("example") PrivateLetterExample example);

    int updateByPrimaryKeySelective(PrivateLetter record);

    int updateByPrimaryKey(PrivateLetter record);
}