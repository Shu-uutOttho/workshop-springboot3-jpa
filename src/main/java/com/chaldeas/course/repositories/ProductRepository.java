package com.chaldeas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaldeas.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}