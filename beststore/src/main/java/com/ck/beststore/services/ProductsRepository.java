package com.ck.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ck.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
