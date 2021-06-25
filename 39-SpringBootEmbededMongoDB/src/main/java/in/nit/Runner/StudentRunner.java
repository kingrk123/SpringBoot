package in.nit.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.Repo.StudentRepo;
import in.nit.model.Student;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private StudentRepo repo;
	@Override
	public void run(String... args) throws Exception {
		
		Student s = repo.save(new Student(101, "SAM", 30.25));
		repo.save(new Student(102, "ANAND", 40.25));
		repo.save(new Student(101, "CHINTU", 50.25));
		
		System.out.println(s.getId());
		
		//---------------------------
		repo.findAll().forEach(System.out::println);
		

	}

}
