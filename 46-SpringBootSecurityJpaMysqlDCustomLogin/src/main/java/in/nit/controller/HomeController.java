package in.nit.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import in.nit.model.User;
import in.nit.service.IUserService;

@Controller
@SessionAttributes({"title"})
public class HomeController {

	@Autowired
	private IUserService service;
	
	@GetMapping("/emp")
	public String showEmp() {
		return "EmployeePage";
	}

	@GetMapping("/std")
	public String showStd() {
		return "StudentPage";
	}

	@GetMapping("/admin")
	public String showAdm() {
		return "AdminPage";
	}

	@GetMapping("/common")
	public String showCommon(Model model, Principal p) {
		User ob = service.getUserByEmail(p.getName());
		model.addAttribute("title", ob.getName());
		 
		return "CommonPage";
	}

	@GetMapping("/denied")
	public String showDenied() {
		return "DeniedPage";
	}
}
