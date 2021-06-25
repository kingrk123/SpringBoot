package in.nit.runner;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class MyDataRunner implements CommandLineRunner {

	private Integer pId;
	private String pCode;
	private List<String> pSub;
	
	@Override
	public String toString() {
		return "MyDataRunner [pId=" + pId + ", pCode=" + pCode + ", pSub=" + pSub + "]";
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public List<String> getpSub() {
		return pSub;
	}

	public void setpSub(List<String> pSub) {
		this.pSub = pSub;
	}

	public MyDataRunner() {
		super();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

}
