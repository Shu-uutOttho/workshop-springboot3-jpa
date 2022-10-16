package com.chaldeas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaldeas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}