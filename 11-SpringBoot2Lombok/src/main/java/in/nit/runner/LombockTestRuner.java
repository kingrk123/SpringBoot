package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.Employee;

@Component
public class LombockTestRuner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Employee emp =new Employee(10, "KingRk", 10.10);
		System.out.println(emp);
		
		Employee e1 = new Employee();
		e1.setEmpId(12);
		e1.setEmpName("Rk");
		e1.setEmpSal(20.20);
		System.out.println(e1);
	}

}
