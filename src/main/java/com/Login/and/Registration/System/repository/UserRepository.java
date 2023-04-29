package com.Login.and.Registration.System.repository;

import com.Login.and.Registration.System.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByFirstName(String firstName);

    Optional<User> findByIdNo(int idNo);

    List<User> findBySurName(String surName);

    Optional<User> findByEmail(String email);
}
