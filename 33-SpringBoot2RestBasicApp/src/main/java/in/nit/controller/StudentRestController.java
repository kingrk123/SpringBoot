package in.nit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(){
		return new ResponseEntity<String>("FROM SAVE", HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(){
		return new ResponseEntity<String>("FROM UPDATE", HttpStatus.OK);
	}
	
	@DeleteMapping("/remove")
	public ResponseEntity<String> removeStudent(){
		return new ResponseEntity<String>("FROM REMOVE", HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<String> fetchAllStudent(){
		return new ResponseEntity<String>("FROM FETCH", HttpStatus.OK);
	}
	
}
