package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import in.nit.model.ProductInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
@ConfigurationProperties(prefix = "my.app")
public class BeanReaderRunner implements CommandLineRunner {

	private ProductInfo pinfo; //HAS-A Relation
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

}
