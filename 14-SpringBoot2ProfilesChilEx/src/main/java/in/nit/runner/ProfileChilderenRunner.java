package in.nit.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class ProfileChilderenRunner implements CommandLineRunner {

	@Value("${app.common}")
	private String common;

	@Value("${app.name}")
	private String appName;
	@Value("${app.version}")
	private double appVrsion;
	@Value("${db.driver}")
	private String dbName;
	@Value("${mail.host}")
	private String mailHost;
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

}
