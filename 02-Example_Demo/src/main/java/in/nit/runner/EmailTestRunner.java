package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(8)
public class EmailTestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("from Email Test Runner-8");
	}

}
