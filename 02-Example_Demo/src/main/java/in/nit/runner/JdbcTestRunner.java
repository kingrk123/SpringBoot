package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class JdbcTestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("from JDBC Test Runner-5");
	}

}
