package com.fardim.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fardim.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
