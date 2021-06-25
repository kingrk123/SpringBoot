package in.nit.controller;

import java.util.ArrayList;
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
		return "Hello World";
	}
	
	@GetMapping("/b")
	public Student showb() {
		return new Student(10, "A", 35.5);
	}
	
	@GetMapping("/c")
	public List<Student> showC(){
		return Arrays.asList(
				new Student(11, "Aa", 65.5),
				new Student(11, "Bb", 65.5),
				new Student(11, "Cc", 65.5));
	}
	

	@GetMapping("/d")
	public Map<String,Student> showD(){
		return Map.of(
				"s1",new Student(11, "Aa", 65.5),
				"s2",new Student(11, "Bb", 65.5),
				"s3",new Student(11, "Cc", 65.5));
	}
}
