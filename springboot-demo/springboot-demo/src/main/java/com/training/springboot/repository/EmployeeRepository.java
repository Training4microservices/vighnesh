package com.training.springboot.repository;

import com.training.springboot.model.Employee;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}