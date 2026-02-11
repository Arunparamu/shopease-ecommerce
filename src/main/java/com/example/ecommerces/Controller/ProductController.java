package com.example.ecommerces.Controller;

import com.example.ecommerces.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.ecommerces.DTO.AdminProductEntity;

@RestController
@RequestMapping("/api/user")
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @GetMapping("/allProduct")
    public List<AdminProductEntity> findAllproduct() {
        return productServices.findAllProduct();
    }

    @GetMapping("/fliter")
    public List<AdminProductEntity> findAllfliter(@RequestParam(required = false) String productName,@RequestParam(required = false) String productCategory) {
        return productServices.findAllfilter(productName,productCategory);
    }

    @GetMapping("/search")
    public List<AdminProductEntity> search(@RequestParam(required = false) String keyword) {
        return productServices.search(keyword);
    }
}
