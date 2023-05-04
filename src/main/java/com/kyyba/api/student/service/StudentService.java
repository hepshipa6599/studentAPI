package com.kyyba.api.student.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kyyba.api.student.Student;
import com.kyyba.api.student.repository.StudentRepos;
@Service
public class StudentService {
	@Autowired
	private StudentRepos studrpos;

	public List<Student> getAllStudDetails() 
	{
		List<Student>stud=new ArrayList<>();
		studrpos.findAll().forEach(stud::add);
		return stud;
		
		}

	
	public void addStudent(Student student) {
		studrpos.save(student);
		
		
	}

	public void deleteStudent(String id,Student student) {
		studrpos.deleteById(id);
		
	}

	public void updateStudent(String id,Student student) {
		studrpos.save(student);
		
		
	}

	
}