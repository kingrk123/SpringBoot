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
	public ResponseEntity<String> saveEmp(){
		return new ResponseEntity<String>("From Save",HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateEmp(){
		return new ResponseEntity<String>("From Update",HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<String> fetchEmp(){
		return new ResponseEntity<String>("From Fetch",HttpStatus.OK);
	}
	
	@DeleteMapping("/remove")
	public ResponseEntity<String> deleteEmp(){
		return new ResponseEntity<String>("From Delete",HttpStatus.OK);
	}
}

