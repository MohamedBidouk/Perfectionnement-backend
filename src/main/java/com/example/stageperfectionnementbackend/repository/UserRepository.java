package com.example.stageperfectionnementbackend.repository;

import com.example.stageperfectionnementbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
