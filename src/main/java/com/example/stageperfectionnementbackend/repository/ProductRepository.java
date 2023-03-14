package com.example.stageperfectionnementbackend.repository;

import com.example.stageperfectionnementbackend.entities.Category;
import com.example.stageperfectionnementbackend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource(path = "rest")
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository <Product, Long> {
    List<Product> findByName(String name);
    List<Product> findByNameContains(String name);
    List<Product> findByPriceBetween(double x, double y);
    List<Product> findByCategory(Category category);
    List<Product> findByCategory_Id(Long categoryId);
}
