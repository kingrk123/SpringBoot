package in.nit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.Employee;
import in.nit.service.impl.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public String showEmp(Model m) {
		m.addAttribute("employee",new Employee());
		return  "EmpReg";
	}
	@PostMapping("/save")
	public String saveEmp(@ModelAttribute Employee employee, 
			Model m) {
		Integer id = service.saveEmployee(employee);
		m.addAttribute("msg", "Employee '"+id+"' Saved!");
		m.addAttribute("employee",new Employee());
		return "EmpReg";
	}
	
	@GetMapping("/all")
	public String showData(Model m) {
		List<Employee> list = service.getAllEmployees();
		m.addAttribute("li", list);
		return "EmpData";
	}
	
	@GetMapping("/delete")
	public String rmData(@RequestParam Integer id,
			Model m) {
		service.deleteEmployee(id);
		return "redirect:all";
	}
	
	@GetMapping("/edit")
	public String showEdit(
			@RequestParam Integer id,
			Model m) {
		Optional<Employee> opt = service.getOneEmployee(id);
		m.addAttribute("employee", opt.get());
		return "EmpEdit";
	}
	@PostMapping("/update")
	public String doUpdate(
			@ModelAttribute Employee employee,
			Model m) {
		
		service.updateEmployee(employee);
		List<Employee> list = service.getAllEmployees();
		m.addAttribute("li", list);
		m.addAttribute("msg", "Employee '"+employee.getEmpId()+"'Updated!");
		return "EmpData";
	}
}
