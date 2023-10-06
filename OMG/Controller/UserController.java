package com.omg.OMG.Controller;

import com.omg.OMG.Entity.User;
import com.omg.OMG.Repository.UserRepo;
import com.omg.OMG.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    UserRepo userRepo;

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {

        return userService.getAllUser();
    }


    @PostMapping("/addUser")
    public User CreateUser(@RequestBody User user) {
        return userService.createUser(user);
    }


    @DeleteMapping("/deleteUser/{id}")
    public  String deleteUser(@PathVariable String id) {
      // return UserService.deleteUser(id);
        userRepo.deleteById(id);

        return id + " - User Deleted!";
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }


    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return userService.existsByEmailandPassword(user);
    }
}



