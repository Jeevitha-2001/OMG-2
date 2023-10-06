package com.omg.OMG.Repository;

import com.omg.OMG.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart,String> {

}
