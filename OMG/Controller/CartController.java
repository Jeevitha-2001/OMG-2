package com.omg.OMG.Controller;


import com.omg.OMG.Entity.Cart;
import com.omg.OMG.Entity.User;
import com.omg.OMG.Repository.CartRepo;
import com.omg.OMG.Repository.UserRepo;
import com.omg.OMG.Service.CartService;
import com.omg.OMG.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {
    @Autowired
    private CartService cartService;
    @Autowired
    CartRepo cartRepo;

    @GetMapping("/getAllCart")
    public List<Cart> getAllCart() {

        return cartService.getAllCart();
    }


    @PostMapping("/addCart")
    public Cart CreateCart(@RequestBody Cart cart) {
        return cartService.createCart(cart);
    }


    @DeleteMapping("/deleteCart/{id}")
    public  String deleteCart(@PathVariable String id) {
        // return UserService.deleteUser(id);
        cartRepo.deleteById(id);
        return id + " Cart Deleted!";
    }


}

