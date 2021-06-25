package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nit.exception.ResourceNotFoundException;
import in.nit.models.Employee;
import in.nit.repository.EmployeeRepo;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo repo;

	// get all employees
		@GetMapping("/employees")
		public List<Employee> getAllEmployees(){
			return repo.findAll();
		}	
		
		// create employee rest api
		@PostMapping("/employees")
		public Employee createEmployee(@RequestBody Employee employee) {
			return repo.save(employee);
		}
		
		// get employee by id rest api
		@GetMapping("/employees/{id}")
		public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
			Employee employee = repo.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
			return ResponseEntity.ok(employee);
		}
		
}
