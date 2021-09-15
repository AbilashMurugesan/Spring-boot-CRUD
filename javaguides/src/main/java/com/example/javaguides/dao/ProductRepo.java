package com.example.javaguides.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javaguides.model.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity,Integer > {

	List<ProductEntity> findByName(String name);
}
