package in.nit.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.User;
import in.nit.model.UserRequest;
import in.nit.model.UserResponse;
import in.nit.service.IUserService;
import in.nit.util.JwtUtil;

@RestController 
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService service;
	
	@Autowired
	private JwtUtil util;

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User user)  {
		Integer id  = service.saveUser(user);
		String body = "User "+id +" saved";
		return ResponseEntity.ok(body);
	}
	
	@PostMapping("/login")
	public ResponseEntity<UserResponse> loginUser(
			@RequestBody UserRequest request){
	
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken
				(request.getUsername(), 
						request.getPassword()));
		String token = util.generateToken(request.getUsername());
		return ResponseEntity.ok(new UserResponse(token,"Success!"));
	}
	
	@PostMapping("/welcome")
	public ResponseEntity<String> accessData(Principal p){
		return ResponseEntity.ok("Hello User " +p.getName());
	}
}
