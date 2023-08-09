package com.memelli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.memelli.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
