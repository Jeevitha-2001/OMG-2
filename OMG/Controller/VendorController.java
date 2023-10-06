package com.omg.OMG.Controller;


import com.omg.OMG.Entity.User;
import com.omg.OMG.Entity.Vendor;
import com.omg.OMG.Repository.UserRepo;
import com.omg.OMG.Repository.VendorRepo;
import com.omg.OMG.Service.UserService;
import com.omg.OMG.Service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendorController {
    @Autowired
    private VendorService vendorService;
    @Autowired
    VendorRepo vendorRepo;

    @GetMapping("/getAllVendor")
    public List<Vendor> getAllVendor() {

        return vendorService.getAllVendor();
    }


    @PostMapping("/addVendor")
    public Vendor CreateVendor(@RequestBody Vendor vendor) {
        return vendorService.createVendor(vendor);
    }


    @DeleteMapping("/deleteVendor/{id}")
    public  String deleteVendor(@PathVariable String id) {
        // return UserService.deleteUser(id);
        vendorRepo.deleteById(id);

        return id + " - Vendor Deleted!";
    }


}


