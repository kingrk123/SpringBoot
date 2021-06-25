package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.Employee;
import in.nit.repo.EmployeeRepo;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepo repo;
	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		
		Employee e = repo.save(new Employee(101, "Venku", 11.5));
		repo.save(new Employee(101, "Venku", 11.5));
		repo.save(new Employee(101, "Venku", 11.5));

		System.out.println(e.getId());
		
		repo.findAll().forEach(System.out::println);

	}

}
