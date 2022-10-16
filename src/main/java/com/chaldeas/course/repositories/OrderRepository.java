package com.chaldeas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaldeas.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}