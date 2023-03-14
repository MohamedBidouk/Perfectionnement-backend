package com.example.stageperfectionnementbackend.restController;

import com.example.stageperfectionnementbackend.entities.Cart;
import com.example.stageperfectionnementbackend.entities.Product;
import com.example.stageperfectionnementbackend.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cart")
@CrossOrigin("*")
public class CartRestController {
    @Autowired
    CartService cartService;
    @RequestMapping(path = "/{cartId}", method = RequestMethod.PUT)
    public Cart addToCart(@PathVariable("cartId")Long cartId, @RequestBody Product product){
        return cartService.addProduct(cartId, product.getId());
    }
    @RequestMapping(method = RequestMethod.POST)
    public Cart createCart(@RequestBody Cart cart){
        return cartService.saveCart(cart);
    }
}
