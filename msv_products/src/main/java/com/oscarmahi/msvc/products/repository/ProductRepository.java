package com.oscarmahi.msvc.products.repository;

import com.oscarmahi.msvc.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Long, Product> {

}
