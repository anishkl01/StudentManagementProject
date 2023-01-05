package com.studentmanagementproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentmanagementproject.studententity.Student;
import com.studentmanagementproject.studentrepository.StudentRepo;

@SpringBootApplication
public class StudentManagementProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementProjectApplication.class, args);
	}

//	@Autowired
//	private StudentRepo studentRepo;

//	@Override
//	public void run(String... args) throws Exception {
//		Student st = new Student("Rohit", "Sharma", "rohit@gmail.com");
//		studentRepo.save(st);
//	}

}
