package com.cicdmyassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@SpringBootApplication
public class CicdmyassignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdmyassignmentApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {

		return "Life is Beautiful,Don't ruin it.Live Every moment";

	}


}
