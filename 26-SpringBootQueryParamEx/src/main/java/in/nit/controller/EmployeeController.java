package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

	// ../show?eid=___&ename=___&esal=___
	@GetMapping("/show")
	public String showData(
			@RequestParam("eid")Integer id,
			@RequestParam("ename")String name,
			@RequestParam Double esal,
			Model model
			) 
	{
		model.addAttribute("aid", id);
		model.addAttribute("aname", name);
		model.addAttribute("asal", esal);
		return "Data";
	}
	

	/*
	 * @GetMapping("/show") public String showData(
	 * 
	 * @RequestParam("ename")String name, Model model ) {
	 * System.out.println("Data is=>"+name); model.addAttribute("aname", name);
	 * return "Data"; }
	 */
}
