package com.example.gitdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloGitApplication {

	@GetMapping("/hellogit")
	public String hello() {
		return "Hello Hi, GIT!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloGitApplication.class, args);
	}
}
