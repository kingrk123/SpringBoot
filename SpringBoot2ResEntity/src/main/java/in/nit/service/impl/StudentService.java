package in.nit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.model.Student;
import in.nit.repo.StudentRepo;
import in.nit.service.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentRepo repo;
	
	@Override
	public Integer saveStd(Student s) {
		return repo.save(s).getStdId();
	}

	@Override
	public void updateStd(Student s) {
		repo.save(s);
	}

	@Override
	public void deleteStd(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Optional<Student> getOneStd(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<Student> getAllStd() {
		return repo.findAll();
	}

	@Override
	public boolean isStdExist(Integer id) {
		return repo.existsById(id);
	}

}
