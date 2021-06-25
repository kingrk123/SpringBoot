package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping
	public String showPage(Model m) {
		m.addAttribute("msg", "Welcome To ThymeLeaf");
		return "Welcome";
	}
	
}
