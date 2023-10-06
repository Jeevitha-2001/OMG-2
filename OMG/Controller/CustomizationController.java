package com.omg.OMG.Controller;

import com.omg.OMG.IdGenerator.CustzIdGenerator;
import com.omg.OMG.Entity.Customization;
import com.omg.OMG.Repository.CustomizationRepo;
import com.omg.OMG.Service.CustomizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;


@RestController
public class CustomizationController {

    @Autowired
    private CustomizationService customizationService;
    @Autowired
    CustomizationRepo customizationRepo;
    @Autowired
    CustzIdGenerator custzGenerator;

//    @GetMapping("/getAllCustomization")
//    public List<Customization> getAllCustomization() {
//
//        return customizationService.getAllCustomization();
//    }

    @GetMapping("/getAllcustomization")
    public List<Customization>getAllcustomization()
    {
        List<Customization> customizations = customizationService.getAllCustomization();
        for(Customization customization : customizations){
            byte[] imageBytes =customization.getCustz_img();
            if(imageBytes != null){
                String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                customization.setBase64Image(base64Image);
            }

        }
        return customizations;
    }


    @PostMapping("/addCustomization")
    public Customization CreateCustomization(@RequestBody Customization customization) {
        customization.setCustz_id(custzGenerator.IdGenerator());
        return customizationRepo.save(customization);
    }


    @DeleteMapping("/deleteCustomization/{id}")
    public  String deleteCustomization(@PathVariable String id) {

        customizationRepo.deleteById(id);

        return id + "Customization Deleted!";
    }

}

