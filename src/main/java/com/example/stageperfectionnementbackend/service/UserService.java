package com.example.stageperfectionnementbackend.service;

import com.example.stageperfectionnementbackend.entities.Role;
import com.example.stageperfectionnementbackend.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User> findAllUsers();
    void deleteUser(Long user_id);
}
