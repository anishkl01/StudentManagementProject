package com.studentmanagementproject.studentservice.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagementproject.studententity.Student;
import com.studentmanagementproject.studentrepository.StudentRepo;
import com.studentmanagementproject.studentservice.StudentService;

@Service
public class StudentImplementation implements StudentService {
	@Autowired
	private StudentRepo studentRepo;

	public StudentImplementation(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {

		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepo.findById(id).get();
	}

	@Override
	public void deleteStudentById(int id) {
		studentRepo.deleteById(id);
		
	}

	
	
	
}
