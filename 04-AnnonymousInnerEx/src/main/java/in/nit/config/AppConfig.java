package in.nit.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public CommandLineRunner clrA() {
		return new CommandLineRunner() {
			public void run(String... args)
					throws Exception{
				System.out.println("from runner code..");
			}
		};
	}
}
