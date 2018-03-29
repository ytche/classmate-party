package site.bigbear.classmate.party;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("site.bigbear.classmate.party.mapper")
public class ClassmatePartyApplicationTests {

	@Test
	public void contextLoads() {
	}

}
