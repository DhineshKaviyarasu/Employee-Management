package com.employee.data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.data.entity.UserData;
import com.employee.data.repo.UserRepo;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class EmployeeSpringbootApplication {
	@Autowired
	private UserRepo userRepo;
	
	@PostConstruct
	public void userinsert() {
		List<UserData> user=Stream.of(
				new UserData(101,"Dhinesh","123","dhinesh@gmail"),
				new UserData(102,"Nithish","456","nith@gmail"),
				new UserData(103,"Raj","789","raj@gmail")).collect(Collectors.toList());
		userRepo.saveAll(user);
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringbootApplication.class, args);
		System.out.println("welcome");
	}

}
