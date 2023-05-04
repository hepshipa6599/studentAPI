package com.kyyba.api.student.repository;

import org.springframework.data.repository.CrudRepository;

import com.kyyba.api.student.Student;



public interface StudentRepos extends CrudRepository <Student,String> {

}
