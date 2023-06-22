package com.example.vaccination.repository;

import com.example.vaccination.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
