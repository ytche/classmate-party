package site.bigbear.classmate.party.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import site.bigbear.classmate.party.ClassmatePartyApplicationTests;

public class UserInfoMapperTest extends ClassmatePartyApplicationTests{
    @Autowired
    private UserInfoMapper mapper;
    @Test
    public void testSelectUserInfo(){
        this.mapper.selectByUserId(1L);
    }
}
