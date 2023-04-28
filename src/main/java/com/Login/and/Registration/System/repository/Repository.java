package com.Login.and.Registration.System.repository;

import com.Login.and.Registration.System.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User, Long> {
}
