package com.example.authentication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthenticationClassTest {
    private AuthenticationClass authenticationClass;

    @BeforeEach
    public void setup() {
        authenticationClass = new AuthenticationClass();
    }

    @Test
    public void testAuthenticateUser_ValidCredentials_ReturnsTrue() {
        assertTrue(authenticationClass.authenticateUser("john", "password123"));
    }

    @Test
    public void testAuthenticateUser_InvalidUsername_ReturnsFalse() {
        assertFalse(authenticationClass.authenticateUser("jane", "wrongpassword"));
    }

    @Test
    public void testAuthenticateUser_InvalidPassword_ReturnsFalse() {
        assertFalse(authenticationClass.authenticateUser("john", "wrongpassword"));
    }

    @Test
    public void testAddUserCredentials_NewUser_ReturnsTrue() {
        assertTrue(authenticationClass.addUserCredentials("alice", "newpassword"));
    }

    @Test
    public void testAddUserCredentials_ExistingUser_ReturnsFalse() {
    }
    }
