package com.omg.OMG.Repository;

import com.omg.OMG.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<Orders,String> {
}
