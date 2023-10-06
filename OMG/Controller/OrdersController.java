package com.omg.OMG.Controller;

import com.omg.OMG.Entity.Orders;
import com.omg.OMG.Entity.User;
import com.omg.OMG.Repository.OrdersRepo;
import com.omg.OMG.Repository.UserRepo;
import com.omg.OMG.Service.OrdersService;
import com.omg.OMG.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    private OrdersService ordersService;
    @Autowired
    OrdersRepo ordersRepo;

    @GetMapping("/getAllOrders")
    public List<Orders> getAllOrders() {

        return ordersService.getAllOrders();
    }


    @PostMapping("/addOrders")
    public Orders CreateOrders(@RequestBody Orders orders) {
        return ordersService.createOrders(orders);
    }


    @DeleteMapping("/deleteOrders/{id}")
    public  String deleteOrders(@PathVariable String id) {
        ordersRepo.deleteById(id);

        return id + "Orders Deleted!";
    }


}

