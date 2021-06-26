package com.example.demo;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller



public class EmployeeController {
	
	@Autowired
	private DataSource ds;
	
	@GetMapping("/")
	public String show() {
		System.out.println(ds);
		return "Home";
		}
	
}
