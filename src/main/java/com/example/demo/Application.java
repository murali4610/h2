package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;


@SpringBootApplication
public class Application implements  ApplicationRunner {
  
	private final static Logger LOGGER=LoggerFactory.getLogger(Application.class);
	@Autowired
	private EmployeeDao employeeDao;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//System.out.println("spring boot runner");
		 LOGGER.info("simple log statement with inputs{},{} and {}",1,2,3);
		employeeDao.findAll().forEach(System.out::println);
	}

}
