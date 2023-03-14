package com.example.stageperfectionnementbackend.service;

import com.example.stageperfectionnementbackend.entities.Role;
import com.example.stageperfectionnementbackend.entities.User;
import com.example.stageperfectionnementbackend.repository.RoleRepository;
import com.example.stageperfectionnementbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public User addRoleToUser(String username, String rolename) {
        User usr = userRepository.findByUsername(username);
        Role role = roleRepository.findByRole(rolename);

        usr.getRoles().add(role);

        //userRepository.save(usr); transactional will do that

        return usr;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long user_id) {
        userRepository.deleteById(user_id);
    }
}
