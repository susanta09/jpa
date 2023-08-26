package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
