package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.Product;
import in.nit.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	private IProductService service; //HAS-A

	//1. Show Product Register page
	@GetMapping({"/reg","/"})
	public String showReg() {
		return "ProductRegister";
	}

	//2. on click submit button, read form data
	@PostMapping("/save")
	public String save(@ModelAttribute Product product,Model model) 
	{
		service.saveProduct(product);
		model.addAttribute("info", "Product '"+product.getProdId()+"' saved!");
		return "ProductRegister";
	}

	//3. Get Data from DB and display at UI
	@GetMapping("/all")
	public String getAll(Model model) {
		List<Product> list=service.getAllProducts();
		model.addAttribute("list", list);
		return "ProductData";
	}

	//4. Delete one row based on ID
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id) 
	{
		service.deleteProduct(id);
		/*
		List<Product> list=service.getAllProducts();
		model.addAttribute("list", list);
		return "ProductData";
		 */
		return "redirect:all";
	}

	//5. Show Edit page with data
	@GetMapping("/edit")
	public String showEdit(@RequestParam Integer id,Model model)
	{
		Product p=service.getOneProduct(id);
		model.addAttribute("product", p);
		return "ProductEdit";
	}
	
	//6. Update Operation
	@PostMapping("/update")
	public String update(@ModelAttribute Product product) {
		service.updateProduct(product);
		return "redirect:all";
	}
	
}
