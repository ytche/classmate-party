package site.bigbear.classmate.party.mapper;

import java.util.List;

import site.bigbear.classmate.party.pojo.User;
import site.bigbear.classmate.party.pojo.UserInfo;
import site.bigbear.classmate.party.pojo.UserInfoExample;

public interface UserInfoMapper extends  BaseMapper<UserInfo> {
    long countByExample(UserInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}