package com.example.entity;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FeedbackApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackApp1Application.class, args);
	}
	 @RestController
	    public static class HomeController {
	        
	        @GetMapping("/")
	        public String home() {
	            return "redirect:/login.html";
	        }
}
}