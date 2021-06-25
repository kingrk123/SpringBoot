package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nit.model.Employee;
import in.nit.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service; //HAS-A
	
	@RequestMapping("/show")
	public String showData(Model model) {
		
		List<Employee> list=service.getAllEmployees();
		model.addAttribute("list", list);
		
		return "EmpData";
	}
}
