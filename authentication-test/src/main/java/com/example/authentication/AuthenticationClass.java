package com.example.authentication;

import java.util.*;

public class AuthenticationClass {
    private Map<String, String> userCredentials;

    public AuthenticationClass() {
        userCredentials = new HashMap<>();
        userCredentials.put("john", "password123"); // Example user credentials (username, password)
        userCredentials.put("jane", "secure456");
    }

    public boolean authenticateUser(String username, String password) {
        if (userCredentials.containsKey(username)) {
            String storedPassword = userCredentials.get(username);
            return storedPassword.equals(password);
        }
        return false;
    }

    public boolean addUserCredentials(String username, String password) {
        if (!userCredentials.containsKey(username)) {
            userCredentials.put(username, password);
            return true;
        }
        return false;
    }

    public boolean removeUserCredentials(String username) {
        if (userCredentials.containsKey(username)) {
            userCredentials.remove(username);
            return true;
        }
        return false;
    }

    // Additional methods for user authentication can be added here

    public int getUserCount() {
        return userCredentials.size();
    }
}
