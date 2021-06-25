package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.nit.model.Employee;

@Controller
public class EmployeeController {

	//1. Show Register page
	//@RequestMapping({"/reg","/"})
	@GetMapping
	public String showReg() {
		return "EmpReg";
	}
	
	//2. on click submit
	//@RequestMapping(value = "/save",method = RequestMethod.POST)
	@PostMapping("/save")
	public String readForm(
			//@ModelAttribute("employee")Employee emp,
			@ModelAttribute Employee employee,
			Model model
			) 
	{
		model.addAttribute("data", employee);
		return "EmpSuccess";
	}
}

