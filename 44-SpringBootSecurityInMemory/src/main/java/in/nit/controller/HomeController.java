package in.nit.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.databind.deser.std.DateDeserializers;

@Controller
public class HomeController {

	@GetMapping("/welcome")
	public String showAll() {
		return "WelcomePage";
	}
	
	@GetMapping("/emp")
	public String showEmp(HttpSession ses) {
		ses.setAttribute("dte", new Date());
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
