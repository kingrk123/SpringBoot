package in.nit.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String username);

}
