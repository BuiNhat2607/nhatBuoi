package com.example.linhkienmaytinh.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.logging.log4j.util.Chars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String email;
    private String phone;
    private String password;

    @ManyToOne
    @JoinColumn(name = "RoleID")
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orders;
}
