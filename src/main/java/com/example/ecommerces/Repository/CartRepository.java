package com.example.ecommerces.Repository;

import com.example.ecommerces.DTO.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<CartEntity,Long> {

    List<CartEntity> findAllByUserId(int userId);
}
