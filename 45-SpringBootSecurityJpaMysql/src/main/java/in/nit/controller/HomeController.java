package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

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
	public String showCommon() {
		return "CommonPage";
	}

	@GetMapping("/denied")
	public String showDenied() {
		return "DeniedPage";
	}
}
