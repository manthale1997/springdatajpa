package com.springdatajpa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springdatajpa.entities.Courses;
@Repository
public interface courseRepository extends CrudRepository<Courses, String>{

}
