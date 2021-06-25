package in.nit.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InputRunner implements CommandLineRunner {

	@Value("${my.app.id}")
	private int appId;
	
	@Value("${my.app.name-info}")
	private String appName;
	
	@Value("${my.app.version-data}")
	private double appVer;
	
	@Value("${my.app.status_enabled}")
	private boolean active;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "InputRunner [appId=" + appId + ", appName=" + appName + ", appVer=" + appVer + ", active=" + active
				+ "]";
	}
}
