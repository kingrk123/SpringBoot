package in.nit.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String username);
	
	
	
}
