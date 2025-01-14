package com.example.crud_spring_boot.domain.repository;

import com.example.crud_spring_boot.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
     User findByUsername(String username);
}
