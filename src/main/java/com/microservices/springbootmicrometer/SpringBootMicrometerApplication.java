package com.microservices.springbootmicrometer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMicrometerApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "working ...!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicrometerApplication.class, args);
	}

}
