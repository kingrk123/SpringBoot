package in.nit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.Student;
import in.nit.service.IStudentService;
import in.nit.service.impl.StudentService;

@RestController
@RequestMapping("/rest/std")
public class StudentRestController {

	@Autowired
	private IStudentService service;
	
	//1. save std
	@PostMapping("/save")
	public ResponseEntity<String> savestd(
			@RequestBody Student student){
		ResponseEntity<String> resp =null;
		try {
			if (student.getStdId()!=null 
				&& service.isStdExist(student.getStdId())){
				resp = new ResponseEntity<String>("Student Id '"+student.getStdId()+"' Already Exist", 
						HttpStatus.BAD_REQUEST);
			} else {
				Integer id = service.saveStd(student);
				resp = new ResponseEntity<String>("Student Id '"+student.getStdId()+"' Created Sucessfully", 
						HttpStatus.OK);
			}
			
		} catch (Exception e) {
			resp = new ResponseEntity<String>("Unable to Save Data", 
					HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	//2. update std
	@PutMapping("/modify")
	public ResponseEntity<String> updatestd(
			@RequestBody Student student){
		ResponseEntity<String> resp = null;
		try {
			if (student.getStdId()!=null
					&& service.isStdExist(student.getStdId())) {
				service.updateStd(student);
				resp = new ResponseEntity<String>("Student Id '"+student.getStdId()+"' is Updated", 
						HttpStatus.OK);
			} else {
				resp = new ResponseEntity<String>("Student Id '"+student.getStdId()+"' is Invalid", 
						HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			resp = new ResponseEntity<String>("Unable To Update Student", 
					HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	//3. Delete std
	@DeleteMapping("/rm/{id}")
	public ResponseEntity<String> deleteStd(
			@PathVariable Integer id){
		ResponseEntity<String> resp = null;
		try {
			if (service.isStdExist(id)) {
				service.deleteStd(id);
				resp = new ResponseEntity<String>("Student Id '"+id+"' is Deleted",
						HttpStatus.OK);
			} else {
				resp = new ResponseEntity<String>("Student Id '"+id+"' is Invalid", 
						HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			resp = new ResponseEntity<String>("Unable To Fetch Student Data", 
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}
	
	//4. Get One std
	@GetMapping("/one/{id}")
	public ResponseEntity<?> getOneStd(
			@PathVariable Integer id){
		ResponseEntity<?> resp = null;
		try {
			Optional<Student> opt = service.getOneStd(id);
			if (opt.isPresent()) {
				Student student = opt.get();
				resp = new ResponseEntity<Student>(student,
						HttpStatus.OK);
			} else {
				resp = new ResponseEntity<String>("Student Id '"+id+"' is Invalid",
						HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			resp = new ResponseEntity<String>("Unable To Fetch Record",
					HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	//5. Get All std
	@GetMapping("/all")
	public ResponseEntity<?> getAllstd(){
		ResponseEntity<?> resp =null;
		try {
			List<Student> list = service.getAllStd();
			resp = new ResponseEntity<List<Student>>(list,
					HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<String>("Unable to Fetch Records",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}
	
}
