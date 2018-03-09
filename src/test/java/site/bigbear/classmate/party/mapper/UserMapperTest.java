package site.bigbear.classmate.party.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import site.bigbear.classmate.party.pojo.User;
import site.bigbear.classmate.party.ClassmatePartyApplicationTests;

import java.util.Date;

public class UserMapperTest extends ClassmatePartyApplicationTests{
    @Autowired
    private  UserMapper userMapper;
    @Test
    public void testInstert(){
        User user=new User();
        user.setName("test");
        user.setPassword("111111");
        user.setIsActive(true);
        user.setCreateUserId(1L);
        user.setCreateTime(new Date());
        user.setLastUpdate(new Date());
        System.out.println(this.userMapper.insert(user));
    }
}
