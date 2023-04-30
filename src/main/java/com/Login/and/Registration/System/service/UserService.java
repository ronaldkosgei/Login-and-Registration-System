package com.Login.and.Registration.System.service;


import com.Login.and.Registration.System.entity.User;
import com.Login.and.Registration.System.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> findByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    public Optional<User> findByIdNo(int idNo){
        return userRepository.findByIdNo(idNo);
    }

    public List<User> findBySurName(String surName){
        return userRepository.findBySurName(surName);
    }

    public Optional<User> findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> updateByIdNo(int idNo){
        return userRepository.updateByIdNo(idNo);
    }
}
