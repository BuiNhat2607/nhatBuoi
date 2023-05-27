package com.example.linhkienmaytinh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminControlller {
    @GetMapping
    public String AdminHome() {
        return "HomeAdmin/index";
    }
}

