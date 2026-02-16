package com.example.ecommerces.Controller;

import com.example.ecommerces.DTO.CartEntity;
import com.example.ecommerces.DTO.ProductDetails;
import com.example.ecommerces.Services.CartServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartServices cartServices;

    @PostMapping("/add-item")
    public String additem(@RequestParam int userId,@RequestParam long productId, @RequestParam  int quantity){
        cartServices.additem(userId,productId,quantity);
        return "added item successfully";
    }

    @GetMapping("/get-cart")
    public List<ProductDetails> getcart(@RequestParam int userId){
        return cartServices.getcart(userId);
    }
}
