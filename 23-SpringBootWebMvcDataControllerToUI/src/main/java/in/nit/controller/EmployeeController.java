package in.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/data")
	public String showData(Model model) {
		System.out.println(model.getClass().getName());
		model.addAttribute("eid", 10);
		model.addAttribute("ename", "ABC");
		model.addAttribute("esal", 3.3);
		return "EmpData";
	}
	
	@RequestMapping("/data1")
	public String showData1(Model model) {
		//JDK >=1.9
		List<String> li=List.of("A","B","C");
		Map<String,String> map=Map.of("K1","V1","K2","V2");
		
		model.addAttribute("list1", li); //data added to request scope
		model.addAttribute("map", map); //data added to request scope
		
		
		return "EmpData1";
	}
}