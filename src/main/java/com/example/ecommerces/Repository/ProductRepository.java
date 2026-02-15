package com.example.ecommerces.Repository;

import com.example.ecommerces.DTO.AdminProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<AdminProductEntity,Long> {

    List<AdminProductEntity> findByProductName(String productName);

    List<AdminProductEntity> findByProductPriceBetween(int minPrice,int maxPrice);

    List<AdminProductEntity> findByProductNameContainingIgnoreCase(String productName);
}
