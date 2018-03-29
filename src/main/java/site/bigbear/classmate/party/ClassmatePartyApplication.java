package site.bigbear.classmate.party;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded
		.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainer;
import org.springframework.boot.context.embedded
		.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.SpringServletContainerInitializer;

/**
 * @author cheyantao
 */
@SpringBootApplication
@MapperScan("site.bigbear.classmate.party.mapper")
@ServletComponentScan
public class ClassmatePartyApplication extends SpringServletContainerInitializer{


	public static void main(String[] args) {
		SpringApplication.run(ClassmatePartyApplication.class, args);
	}

}
