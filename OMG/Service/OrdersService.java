package com.omg.OMG.Service;


import com.omg.OMG.Entity.Orders;
import com.omg.OMG.Entity.User;
import com.omg.OMG.Repository.OrdersRepo;
import com.omg.OMG.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrdersService {
    @Autowired
        private OrdersRepo ordersRepo;

        public Orders createOrders(Orders orders) {
            return ordersRepo.save(orders);
        }

        public List<Orders> getAllOrders() {
            return ordersRepo.findAll();
        }

        public Orders insertOrders(Orders orders) {
            return ordersRepo.save(orders);
        }

    }
