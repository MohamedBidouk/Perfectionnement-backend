package com.example.stageperfectionnementbackend.service;

import com.example.stageperfectionnementbackend.entities.Category;
import com.example.stageperfectionnementbackend.entities.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Product product);
    void deleteProductById(Long id);
    Product getProduct(Long id);
    List<Product> getAllProduct();
    List<Product> findByName(String name);
    List<Product> findByNameContains(String name);
    List<Product> findByPriceBetween(double x, double y);
    List<Product> findByCategory(Category category);
    List<Product> findByCategoryId(Long categoryId);
    
}
