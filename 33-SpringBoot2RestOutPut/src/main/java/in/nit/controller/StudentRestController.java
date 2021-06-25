package in.nit.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.Student;

@RestController
public class StudentRestController {

	@GetMapping("/a")
	public String showA() {
		return "HELLO TEXT";
	}
	
	@GetMapping("/b")
	public Student showB() {
		return new Student(10,"A",3.3);
	}
	
	@GetMapping("/c")
	public List<Student> showC() {
		return Arrays.asList(
				new Student(10,"A",3.3),
				new Student(11,"B",4.3),
				new Student(12,"C",6.3)
				);
	}
	
	@GetMapping("/d")
	public Map<String,Student> showD() {
		return Map.of(
				"S1",new Student(10,"A",3.3),
				"S2",new Student(11,"B",4.3),
				"S3",new Student(12,"C",6.3)
				);
	}

	
}
