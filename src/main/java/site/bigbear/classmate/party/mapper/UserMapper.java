package site.bigbear.classmate.party.mapper;

import java.util.List;
import site.bigbear.classmate.party.pojo.User;
import site.bigbear.classmate.party.pojo.UserExample;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}