package in.nit.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InputReadRunner implements CommandLineRunner {

	@Value("${my.app.id}")
	private int appId;
	
	@Value("${my.app.name-info}")
	private String appName;
	
	@Value("${my.app.version-data}")
	private double appVer;
	
	@Value("${my.app.status_enable}")
	private boolean appStatus;

	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}

	@Override
	public String toString() {
		return "InputReadRunner [appId=" + appId + ", appName=" + appName + ", appVer=" + appVer + ", appStatus="
				+ appStatus + "]";
	}

}
