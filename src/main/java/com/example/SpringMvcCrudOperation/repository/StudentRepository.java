package com.example.SpringMvcCrudOperation.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringMvcCrudOperation.model.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{
	
}
