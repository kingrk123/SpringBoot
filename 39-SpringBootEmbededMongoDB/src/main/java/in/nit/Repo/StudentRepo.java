package in.nit.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.nit.model.Student;

public interface StudentRepo extends MongoRepository<Student, String> {

}
