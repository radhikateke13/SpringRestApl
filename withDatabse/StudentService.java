package com.example.demo.withDatabse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository sRepository;

	public List<Student> getAllStudents() {
		return sRepository.findAll();
	}

	public Student addStudent(Student student) {
		return sRepository.save(student);
	}

	public Student searchStudentById(int sid) {
		return sRepository.findById(sid).get();
	}

	public List<Student> searchByStudents(String sname) {
		return sRepository.findBysname(sname);
	}

	public void deleteStudent(int sid) {
		// Student St= new Student();
		// St.setSid(sid);
		sRepository.deleteById(sid);

	}
	
	public Student updatedetelibyid(int sid,Student student)
	{
		student.setSid(sid);
		return sRepository.save(student);
		
	}

}
