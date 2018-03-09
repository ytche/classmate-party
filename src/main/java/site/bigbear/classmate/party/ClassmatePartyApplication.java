package site.bigbear.classmate.party;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded
		.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainer;
import org.springframework.boot.context.embedded
		.EmbeddedServletContainerCustomizer;

/**
 * @author cheyantao
 */
@SpringBootApplication
public class ClassmatePartyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassmatePartyApplication.class, args);
	}

}
