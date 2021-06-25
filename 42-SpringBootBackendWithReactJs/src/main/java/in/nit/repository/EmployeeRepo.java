package in.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.models.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
