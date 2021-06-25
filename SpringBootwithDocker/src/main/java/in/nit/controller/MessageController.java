package in.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	@GetMapping("/")
	public String showMsg() {
		return "Welcome Kiran To Docker" ;
	}
}
