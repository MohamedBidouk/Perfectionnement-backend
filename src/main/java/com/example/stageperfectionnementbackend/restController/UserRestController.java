package com.example.stageperfectionnementbackend.restController;

import com.example.stageperfectionnementbackend.entities.Role;
import com.example.stageperfectionnementbackend.entities.User;
import com.example.stageperfectionnementbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserRestController {
    @Autowired
    UserService userService;
    @RequestMapping(path="allUser", method=RequestMethod.GET)
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }
    @RequestMapping(path = "createUser", method=RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @RequestMapping(path = "/{username}",method=RequestMethod.PUT)
    public User addRoleToUser(@PathVariable("username")String username, @RequestBody Role role){
        System.out.println(role);
        return userService.addRoleToUser(username, role.getRole());
    }
    @RequestMapping(path = "/{user_id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("user_id")Long userId){
        userService.deleteUser(userId);
    }

}
