package com.chaldeas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaldeas.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}