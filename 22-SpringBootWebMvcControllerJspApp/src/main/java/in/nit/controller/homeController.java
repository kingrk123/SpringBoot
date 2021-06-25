package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

	@RequestMapping("/show")
	public String viewPage() {
		return "Home"; //UI page name
	}

	@RequestMapping(value = {"/register","reg"}) //GET
	public String showReg() {
		return "EmpReg";
	}
}
