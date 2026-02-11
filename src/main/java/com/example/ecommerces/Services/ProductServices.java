package com.example.ecommerces.Services;

import com.example.ecommerces.DTO.AdminProductEntity;
import com.example.ecommerces.Repository.AdminProductRepository;
import com.example.ecommerces.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    public List<AdminProductEntity> findAllProduct() {
        return productRepository.findAll();
    }

    public List<AdminProductEntity> findAllfilter(String productName,String productCategory) {
        if(productName!=null && productCategory!=null)
        {
            return productRepository.findByProductNameAndProductCategory(productName,productCategory);
        }
        else {
            return productRepository.findAll();
        }
    }

    //search bar
    public List<AdminProductEntity> search(String keyword) {
        if(keyword!=null && keyword.length()>0) {
            return productRepository.findByProductNameContainingIgnoreCase(keyword);
        }
        else {
            return productRepository.findAll();
        }
    }
}
