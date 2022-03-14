package com.example.demo.rep;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Student;

public interface StudentRepository extends MongoRepository<Student,Integer>{

}
