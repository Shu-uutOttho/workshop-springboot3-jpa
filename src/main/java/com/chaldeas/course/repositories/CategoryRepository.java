package com.chaldeas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaldeas.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}