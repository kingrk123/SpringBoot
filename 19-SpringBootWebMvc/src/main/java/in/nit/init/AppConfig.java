package in.nit.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("in.nit")
@PropertySource("classpath:application.properties")
public class AppConfig {
	@Bean
	public InternalResourceViewResolver ivr() {
		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	}
	
}