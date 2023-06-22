package com.example.vaccination.controller;
import com.example.model.*;

//Import required packages
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
 
 // Assuming you have a login endpoint
 @PostMapping("/login")
 public ResponseEntity<String> login(@RequestBody LoginForm loginForm) {
     // Perform login authentication logic here
     // Check if username and password are valid
     
     if (isValidCredentials(loginForm.getUsername(), loginForm.getPassword())) {
         // Redirect the user to the vaccination center homepage
         HttpHeaders headers = new HttpHeaders();
         headers.add("Location", "/vaccinationcenter/home");
         return new ResponseEntity<>(headers, HttpStatus.FOUND);
     } else {
         // Handle invalid credentials case
         return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
     }
 }
 
 // Utility method to check if the credentials are valid
 private boolean isValidCredentials(String username, String password) {
     // Your authentication logic here
     // Return true if the credentials are valid, otherwise false
     // Example:
     return username.equals("admin") && password.equals("password");
 }
}
