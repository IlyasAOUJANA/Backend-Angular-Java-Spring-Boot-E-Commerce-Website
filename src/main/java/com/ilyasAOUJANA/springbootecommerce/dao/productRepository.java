package com.ilyasAOUJANA.springbootecommerce.dao;

import com.ilyasAOUJANA.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface productRepository extends JpaRepository<Product, Long> {
}