package com.example.stageperfectionnementbackend.repository;

import com.example.stageperfectionnementbackend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}
