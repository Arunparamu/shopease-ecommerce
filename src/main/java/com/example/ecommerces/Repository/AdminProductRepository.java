package com.example.ecommerces.Repository;

import com.example.ecommerces.DTO.AdminProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminProductRepository extends JpaRepository<AdminProductEntity,Long> {
}
