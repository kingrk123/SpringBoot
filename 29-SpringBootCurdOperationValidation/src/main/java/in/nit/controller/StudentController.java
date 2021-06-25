package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.Student;
import in.nit.service.IStudentService;

@Controller
public class StudentController {
	@Autowired
	private IStudentService service;
	
	//1. show reg page
	@GetMapping("/register")
	public String showReg(Model model) {
		//Form Backing Object
		model.addAttribute("student", new Student());
		return "StudentRegister";
	}
	
	//2. save student
	@PostMapping("/save")
	public String save(@ModelAttribute Student student,Model model) 
	{
		Integer id=service.saveStudent(student);
		model.addAttribute("message", "Student '"+id+"' saved!");
		//Form Backing Object
		model.addAttribute("student", new Student());
		return "StudentRegister";
	}
	
	//3. Fetch Data to UI
	@GetMapping("/all")
	public String fetchAll(Model model)
	{
		List<Student> list=service.getAllStudents();
		model.addAttribute("list", list);
		return "StudentData";
	}
	
	//4. delete row based on Id
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id) {
		if(service.isStudentExist(id)) {
			service.deleteStudent(id);
		}
		//response.sendRedirect
		return "redirect:all";
	}
	//5. show Edit Page with data
	@GetMapping("/edit")
	public String showEdit(@RequestParam Integer id,Model model) {
		model.addAttribute("student", service.getOneStudent(id));
		return "StudentEdit";
	}
	
	//6. On click update button
	@PostMapping("/update")
	public String update(@ModelAttribute Student student,Model model) {
		service.updateStudent(student);
		return "redirect:all";
	}
	
}
