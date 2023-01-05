package com.studentmanagementproject.studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.studentmanagementproject.studententity.Student;
import com.studentmanagementproject.studentservice.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("/students")
	public ModelAndView listStudent() {
		ModelAndView view = new ModelAndView();
		view.addObject("students", studentService.getAllStudents());
		view.setViewName("students");
		return view;
	}

	@GetMapping("/students/new")
	public ModelAndView createStudent(Student student) {
		ModelAndView view = new ModelAndView("createstudent");
		view.addObject("students", student);
		return view;
	}

	@PostMapping("/students")
	public ModelAndView saveStudent(@ModelAttribute("students") Student student) {
		ModelAndView view = new ModelAndView("redirect:/students");
		view.addObject(studentService.saveStudent(student));
		return view;
	}
	
	@GetMapping("/students/update/{s_id}")
	public ModelAndView updateStudent(@PathVariable("s_id") int s_id) {
		ModelAndView view = new ModelAndView();
		view.addObject("students", studentService.getStudentById(s_id));
		view.setViewName("update");
		return view;
	}
	
	@PostMapping("/students/{s_id}")
	public ModelAndView editForm(@PathVariable("s_id") int s_id, @ModelAttribute("students") Student student) {
		ModelAndView view = new ModelAndView();
		Student existingStudent = studentService.getStudentById(s_id);
		existingStudent.setS_fname(student.getS_fname());
		existingStudent.setS_lname(student.getS_lname());
		existingStudent.setS_email(student.getS_email());
		studentService.updateStudent(existingStudent);
		view.setViewName("redirect:/students");
		return view;
		
	}
	
	@GetMapping("/students/delete/{s_id}") 
	public ModelAndView deleteById(@PathVariable("s_id") int id) {
		ModelAndView view = new ModelAndView();
		studentService.deleteStudentById(id);
		view.setViewName("redirect:/students");
		return view;
	}
}
