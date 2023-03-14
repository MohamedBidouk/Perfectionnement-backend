package com.example.stageperfectionnementbackend.service;

import com.example.stageperfectionnementbackend.entities.Cart;
import com.example.stageperfectionnementbackend.entities.Product;
import com.example.stageperfectionnementbackend.repository.CartRepository;
import com.example.stageperfectionnementbackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    CartRepository cartRepository;
    @Autowired
    ProductRepository productRepository;

    @Override
    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart updateCart(Long cartId, Cart cart) {
        Cart cart1 = cartRepository.findById(cartId).get();

        return null;
    }

    @Override
    public Cart addProduct(Long cartId, Long productId) {
        Cart cart = cartRepository.findById(cartId).get();
        Product product = productRepository.findById(productId).get();
        cart.getProducts().add(product);
        return cart;
    }
}
