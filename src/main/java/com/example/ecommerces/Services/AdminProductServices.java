package com.example.ecommerces.Services;

import com.example.ecommerces.DTO.AdminProductEntity;
import com.example.ecommerces.Repository.AdminProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminProductServices {

    @Autowired
    private AdminProductRepository adminProductRepository;

    public void addproducts(AdminProductEntity adminProductEntity) {
        adminProductRepository.save(adminProductEntity);
    }

    public void deleteproducts(Long id) {
        adminProductRepository.deleteById(id);
    }
}
