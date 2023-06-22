package com.yourcompany.projectname.security;

import java.util.ArrayList;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        // Perform authentication logic here
        // Example: check username and password against a database or external service
        if (isValidUser(username, password)) {
            // Create and return an authenticated Authentication object
            return new UsernamePasswordAuthenticationToken(username, password, new ArrayList<>());
        } else {
            // Throw an AuthenticationException if authentication fails
            throw new BadCredentialsException("Invalid username or password");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    private boolean isValidUser(String username, String password) {
        // Implement your custom validation logic
        // Example: check against a user repository or call an external service
        return true; // Replace with your actual validation logic
    }
}
