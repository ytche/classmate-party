package site.bigbear.classmate.party.service;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import site.bigbear.classmate.party.mapper.BaseMapper;
import site.bigbear.classmate.party.mapper.UserMapper;
import site.bigbear.classmate.party.pojo.User;

import java.util.List;

/**
 * @author cheyantao
 */
@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return  this.userMapper.selectByExample(null);
    }

    @Override
    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public Object save(User user) {
        if (user.getId()==null){
            return userMapper.insert(user);
        }else {
            return userMapper.updateByPrimaryKey(user);
        }
    }
}
