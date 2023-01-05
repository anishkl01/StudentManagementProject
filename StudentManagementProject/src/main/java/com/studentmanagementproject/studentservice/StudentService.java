package com.studentmanagementproject.studentservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentmanagementproject.studententity.Student;


public interface StudentService {
	
	public List<Student> getAllStudents();
	
	public Student saveStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public Student getStudentById(int id);
	
	void deleteStudentById(int id);
	
}
