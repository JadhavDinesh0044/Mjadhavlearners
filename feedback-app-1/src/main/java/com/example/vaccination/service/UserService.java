package com.example.vaccination.service;

import com.example.vaccination.model.User;


import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
}
