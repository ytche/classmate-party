package site.bigbear.classmate.party.service;

import site.bigbear.classmate.party.pojo.User;

import java.util.List;

/**
 * @author cheyantao
 */
public interface UserService extends  BaseService {
    /**
     * 查询全部
     * @return
     */
    List<User> findAll();

    /**
     * @return
     */
    User findById(Long id);

    Object save(User user);
}
