package site.bigbear.classmate.party.service;

import site.bigbear.classmate.party.pojo.User;
import site.bigbear.classmate.party.pojo.UserInfo;

/**
 * @author cheyantao
 */
public interface UserInfoService extends BaseService{

    UserInfo findByUserId(Long id);

    boolean save(UserInfo user);

    boolean delete(Long id);
}
