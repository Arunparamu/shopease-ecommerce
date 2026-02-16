package com.example.ecommerces.Services;

import com.example.ecommerces.DTO.CartEntity;
import com.example.ecommerces.DTO.ProductDetails;
import com.example.ecommerces.Repository.AdminProductRepository;
import com.example.ecommerces.Repository.CartRepository;
import com.example.ecommerces.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ecommerces.DTO.AdminProductEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServices {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private AdminProductRepository adminProductRepository;

    public void additem(int  userId,long productId,int quantity){
        //System.out.println(User_id+" "+Productd+" "+Quantity);
        CartEntity cartEntity = new CartEntity(userId,productId,quantity);
        cartRepository.save(cartEntity);
    }

    public List<ProductDetails> getcart(int userId){
        List<CartEntity> cartList=cartRepository.findAllByUserId(userId);
        List<ProductDetails> productDetails=new ArrayList<>();
        for(CartEntity cartEntity:cartList){
            AdminProductEntity product=adminProductRepository.findById(cartEntity.getProductId()).orElse(null);
            if(product!=null){
                ProductDetails productDetails1=new ProductDetails(product.getId(),product.getProductName(),product.getProductPrice(),product.getProductStock(),cartEntity.getQuantity());
                productDetails.add(productDetails1);
            }
        }
        return productDetails;
    }
}
