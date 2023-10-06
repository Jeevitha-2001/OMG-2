package com.omg.OMG.Service;

import com.omg.OMG.Entity.Cart;
import com.omg.OMG.Entity.User;
import com.omg.OMG.Repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepo cartRepo;

    public Cart createCart(Cart cart) {
        return cartRepo.save(cart);
    }

    public List<Cart> getAllCart() {
        return cartRepo.findAll();
    }

    public Cart insertCart(Cart cart) {
        return cartRepo.save(cart);
    }

}
