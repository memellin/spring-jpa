package com.memelli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.memelli.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
