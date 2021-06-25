package in.nit.service;

import java.util.List;
import java.util.Optional;

import in.nit.model.Student;

public interface IStudentService {

	public Integer saveStd(Student s);
	public void updateStd(Student s);
	public void deleteStd(Integer id);
	public Optional<Student> getOneStd(Integer id);
	public List<Student> getAllStd();
	public boolean isStdExist(Integer id);
}
