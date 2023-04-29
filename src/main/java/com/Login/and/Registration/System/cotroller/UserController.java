package com.Login.and.Registration.System.cotroller;


import com.Login.and.Registration.System.entity.User;
import com.Login.and.Registration.System.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("users")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("users")
    public List<User> getAllUsers(@RequestBody User user){
        return userService.getAll();
    }

    @GetMapping("name/{firstName}")
    public List<User> findByFirstName(@PathVariable String firstName){
        return userService.findByFirstName(firstName);
    }

    @GetMapping(("surname/{surName}"))
    public List<User> findBySurName(@PathVariable String surName){
        return userService.findBySurName(surName);
    }

    @GetMapping("idno")
    public Optional<User> findByIdNo(@RequestParam int idNo){
        return userService.findByIdNo(idNo);
    }

    @GetMapping("email/{email}")
    public  Optional<User> findByEmail(@PathVariable String email){
        return userService.findByEmail(email);
    }
}
