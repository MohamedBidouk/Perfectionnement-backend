package com.example.stageperfectionnementbackend.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "firstnameProduct", types = {Product.class})
public interface ProductProjection {
    public String getName();
}
