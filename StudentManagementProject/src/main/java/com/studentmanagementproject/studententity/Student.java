package com.studentmanagementproject.studententity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int s_id;

	@Column(name = "firstname", nullable = true)
	private String s_fname;

	@Column(name = "lastname", nullable = true)
	private String s_lname;

	@Column(name = "email", nullable = true, unique = true)
	private String s_email;

	public long getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_fname() {
		return s_fname;
	}

	public void setS_fname(String s_fname) {
		this.s_fname = s_fname;
	}

	public String getS_lname() {
		return s_lname;
	}

	public void setS_lname(String s_lname) {
		this.s_lname = s_lname;
	}

	public String getS_email() {
		return s_email;
	}

	public void setS_email(String s_email) {
		this.s_email = s_email;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_fname=" + s_fname + ", s_lname=" + s_lname + ", s_email=" + s_email + "]";
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student( String s_fname, String s_lname, String s_email) {
		super();
		this.s_fname = s_fname;
		this.s_lname = s_lname;
		this.s_email = s_email;
	}
	
	
}
