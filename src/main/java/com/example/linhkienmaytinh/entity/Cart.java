package com.example.linhkienmaytinh.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;
}
