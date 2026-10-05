package com.snikz.springecom.service;


import com.snikz.springecom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepo extends JpaRepository<Product, Integer> {
    
}
