package com.example.ecommerces.DTO;

import jakarta.persistence.*;

@Entity
@Table(name = "cart")
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "product_id")
    private long productId;

    @Column(name = "quantity")
    private int quantity;

    // Default constructor (Required)
    public CartEntity(){}

    //  Parameterized constructor
    public CartEntity(int userId, long productId, int quantity){
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    // getters & setters
    public long getId() { return id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public long getProductId() { return productId; }
    public void setProductId(long productId) { this.productId = productId; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}