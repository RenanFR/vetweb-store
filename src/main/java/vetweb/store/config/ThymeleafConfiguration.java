package vetweb.store.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@Configuration
public class ThymeleafConfiguration {
	
	@Bean
	public LayoutDialect layoutDialect() {
		return new LayoutDialect();
	}

}
