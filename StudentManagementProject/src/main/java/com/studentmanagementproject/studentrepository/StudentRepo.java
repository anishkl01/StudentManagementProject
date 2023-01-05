package com.studentmanagementproject.studentrepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.studentmanagementproject.studententity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	
}
