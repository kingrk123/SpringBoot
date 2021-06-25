package in.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.nit.model.User;
import in.nit.service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService servie;
	
	@GetMapping("/register")
	public String showReg() {
		return "UserRegister";
	}
	

	@PostMapping("/save")
	public String saveUser(
			@ModelAttribute User user,
			Model model)
	{
		Integer id = servie.saveUser(user);
		String message = "User '"+id+"' saved";
		model.addAttribute("message", message);
		return "UserRegister";
		
	}
	
	@GetMapping("/login")
	public String showLogin() {
		return "LoginPage";
	}
}
