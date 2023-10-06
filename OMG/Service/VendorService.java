package com.omg.OMG.Service;

import com.omg.OMG.Entity.User;
import com.omg.OMG.Entity.Vendor;
import com.omg.OMG.Repository.UserRepo;
import com.omg.OMG.Repository.VendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {

    @Autowired
    private VendorRepo vendorRepo;

    public Vendor createVendor(Vendor vendor) {
        return vendorRepo.save(vendor);
    }

    public List<Vendor> getAllVendor() {
        return vendorRepo.findAll();
    }

    public Vendor insertVendor(Vendor vendor) {
        return vendorRepo.save(vendor);
    }

}
