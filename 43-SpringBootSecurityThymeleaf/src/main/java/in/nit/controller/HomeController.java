package in.nit.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping
	public String showPage(Model m, Principal p) {
		
		m.addAttribute("msg", "Welcome To ThymeLeaf "+p.getName());
		return "Welcome";
	}
	
}
