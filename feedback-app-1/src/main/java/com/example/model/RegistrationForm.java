package com.example.model;

public class RegistrationForm {
    private String username;
    private String password;
    private String email;
    // Add any other necessary fields

    public RegistrationForm() {
    }

    public RegistrationForm(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Add getters and setters for all fields

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
