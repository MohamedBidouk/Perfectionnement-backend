package com.example.stageperfectionnementbackend.service;

import com.example.stageperfectionnementbackend.entities.Cart;

public interface CartService {
    Cart saveCart(Cart cart);
    Cart updateCart(Long cartId, Cart cart);
    Cart addProduct(Long cartId, Long productId);
}
