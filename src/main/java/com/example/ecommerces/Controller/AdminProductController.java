package com.example.ecommerces.Controller;

import com.example.ecommerces.DTO.AdminProductEntity;
import com.example.ecommerces.Repository.AdminProductRepository;
import com.example.ecommerces.Services.AdminProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminProductController {

    @Autowired
    private AdminProductServices adminProductServices;

    @PostMapping("/addproduct")
    public String addproduct(@RequestBody AdminProductEntity adminProductEntity) {
        adminProductServices.addproducts(adminProductEntity);
        return  "add product successfully";
    }

    @DeleteMapping("/deleteproduct/{id}")
    public String deleteproduct(@PathVariable Long id) {
         adminProductServices.deleteproducts(id);
         return  "delete product successfully";
    }
}
