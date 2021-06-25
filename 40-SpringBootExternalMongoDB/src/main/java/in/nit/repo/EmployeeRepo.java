package in.nit.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.nit.model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, String> {

}
