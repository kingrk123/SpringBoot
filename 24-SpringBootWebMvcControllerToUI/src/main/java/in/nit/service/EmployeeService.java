package in.nit.service;

import java.util.List;

import org.springframework.stereotype.Component;

import in.nit.model.Employee;

@Component
public class EmployeeService {

	public List<Employee> getAllEmployees(){
		return List.of(
				new Employee(10,"A",3.3),
				new Employee(11,"B",3.8),
				new Employee(12,"C",4.3)
				);
	}
}