package com.kyyba.api.student.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.kyyba.api.student.Student;
import com.kyyba.api.student.service.StudentService;

import springdata.employee.Employee;


@RestController
class StudentController {
	@Autowired
	private StudentService stuser;
	
	@RequestMapping("/student")
	public List<Student>getStudDetails(){
		return stuser.getAllStudDetails();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/student")
	public void addStudent(@RequestBody Student student) {
		stuser.addStudent(student);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/student/{id}")
	public void updateEmployee(@RequestBody Student student,@PathVariable String id) {
		stuser.updateStudent(id,student);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/student/{id}")
	public void deleteStudent(@RequestBody Student student,@PathVariable String id) {
		stuser.deleteStudent(id,student);
	}
}





