package com.example.vaccination.controller;
import com.example.model.RegistrationForm;

//Import required packages
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
 
 // Assuming you have a registration endpoint
 @PostMapping("/register")
 public ResponseEntity<String> register(@RequestBody RegistrationForm registrationForm) {
     // Perform registration logic here
     // Check if the username is available and store the new user's credentials
     
     if (isUsernameAvailable(registrationForm.getUsername())) {
         // Store the user's credentials in the database or any other storage mechanism
         
         // Redirect the user to the login page
         HttpHeaders headers = new HttpHeaders();
         headers.add("Location", "/login");
         return new ResponseEntity<>(headers, HttpStatus.FOUND);
     } else {
         // Handle case where the username is already taken
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username is already taken");
     }
 }
 
 // Utility method to check if the username is available
 private boolean isUsernameAvailable(String username) {
     // Your logic to check if the username is available
     // Return true if the username is available, otherwise false
     // Example:
     return !usernameExistsInDatabase(username);
 }
 
 // Utility method to check if the username already exists in the database
 private boolean usernameExistsInDatabase(String username) {
     // Your logic to check if the username exists in the database
     // Return true if the username exists, otherwise false
     // Example:
     // Query the database to check if the username exists
     // Return true if found, otherwise false
     // Note: This is just an example; you should use proper database access methods and security measures
     return false;
 }
}
