package com.omg.OMG.Service;

import com.omg.OMG.Entity.Customization;
import com.omg.OMG.Entity.Vendor;
import com.omg.OMG.Repository.CustomizationRepo;
import com.omg.OMG.Repository.VendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomizationService {

    @Autowired
    private CustomizationRepo customizationRepo;

    public Customization createCustomization(Customization customization) {
        return customizationRepo.save(customization);
    }

    public List<Customization> getAllCustomization() {
        return customizationRepo.findAll();
    }

    public Customization insertCustomization(Customization customization) {
        return customizationRepo.save(customization);
    }

}


