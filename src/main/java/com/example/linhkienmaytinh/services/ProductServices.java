//package com.example.linhkienmaytinh.services;
//
//import ch.qos.logback.core.model.Model;
//import com.example.linhkienmaytinh.entity.Product;
//import com.example.linhkienmaytinh.repository.IProductRepository;
//import jakarta.persistence.Id;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Service;
//
//
//import java.util.List;
//import java.util.Optional;
//@Service
//public class ProductServices {
//    @Autowired
//    private IProductRepository productRepository;
//
//    public List<Product> getAllProducts() {
//        return productRepository.findAll();
//    }
//
//    public Product getProductById(Long id) {
//        Optional<Product> optional = productRepository.findById(id);
//        return optional.orElse(null);
//    }
//
//    public void addProduct(Product product) {
//        productRepository.save(product);
//    }
//
//    public void updateProduct(Product product) {
//        productRepository.save(product);
//    }
//
////    public void deleteProduct(Product product){productRepository.deleteById(id);}
//
//
//}
//
