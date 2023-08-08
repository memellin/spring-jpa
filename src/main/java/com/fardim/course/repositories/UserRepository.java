package com.fardim.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fardim.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
