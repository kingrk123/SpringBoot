package in.nit.service;

import in.nit.model.User;

public interface IUserService {

	public Integer saveUser(User user);
	public User getUserByEmail(String email);
}
