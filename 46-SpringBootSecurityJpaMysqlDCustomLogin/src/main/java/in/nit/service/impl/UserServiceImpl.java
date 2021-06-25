package in.nit.service.impl;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import in.nit.model.User;
import in.nit.repo.UserRepository;
import in.nit.service.IUserService;

@Service
public class UserServiceImpl implements IUserService, UserDetailsService {
	@Autowired
	private UserRepository repo;

	@Autowired
	private BCryptPasswordEncoder pwdEncoder;
	@Override
	public Integer saveUser(User user) {
		String pwd = pwdEncoder.encode(user.getPwd());
		user.setPwd(pwd);
		return repo.save(user).getId();
	}
	
	@Override
	public User getUserByEmail(String email) {
		Optional<User> opt = repo.findByEmail(email);
		return opt.get();
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {

		Optional<User> opt = repo.findByEmail(username); //email
		if(opt.isEmpty())
			throw new UsernameNotFoundException("User Not Found :" + username);

		User user = opt.get();

		// UserDetails (I) <- Impl :  User(C) [org.sf..]

		return new org.springframework.security.core.userdetails
				.User(
						username, //username
						user.getPwd(), //password
						user.getRoles().stream()   //Set<GA>
						.map(role-> new SimpleGrantedAuthority(role))
						.collect(Collectors.toSet())
						);


	}
}