package com.example.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eCommerce.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
