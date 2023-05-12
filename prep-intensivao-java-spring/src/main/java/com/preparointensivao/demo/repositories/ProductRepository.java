package com.preparointensivao.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preparointensivao.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
