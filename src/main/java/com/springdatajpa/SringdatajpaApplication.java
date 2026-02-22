package com.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springdatajpa.entities.Courses;
import com.springdatajpa.repositories.courseRepository;

@SpringBootApplication
public class SringdatajpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SringdatajpaApplication.class, args);
		courseRepository repo= context.getBean(courseRepository.class);
	//	System.out.println(repo.getClass());
	/*	Courses c1= new Courses();
		c1.setCourseId("ui");
		c1.setCourseDuration("2 Months");
		c1.setCourseName("Front end");
		c1.setCourseFee(15000);
		repo.save(c1);   
		
		System.out.println("Number of courses : " + repo.count());
		
		//select records
		Courses c= repo.findById("fsj").get();
		System.out.println(c);
		
		//select all
		Iterable<Courses> course= repo.findAll();
	//	course.forEach(c-> System.out.println(c));
		
		course.forEach(System.out::println);//method reference
		
		//update operation
		Courses c= repo.findById("fsj").get();
		c.setCourseFee(26000);
		c.setCourseDuration("6 months");
		repo.save(c);
		
		//delete operation
		if (repo.existsById("fsj"))
			repo.deleteById("fsj");
		else 
			System.out.println("Course does not exists");
		*/
		//delete all
		repo.deleteAll();
	}

}
