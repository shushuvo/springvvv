package com.example.school2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class School2Application {

	public static void main(String[] args) {
		SpringApplication.run(School2Application.class, args);
	}
	
	  @RequestMapping(value = "/{path:[^\\.]*}")
	    public String redirect() {
	        return "forward:/";
	    }

}
