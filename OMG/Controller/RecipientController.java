package com.omg.OMG.Controller;

import com.omg.OMG.Entity.Recipient;
import com.omg.OMG.Entity.User;
import com.omg.OMG.Repository.RecipientRepo;
import com.omg.OMG.Repository.UserRepo;
import com.omg.OMG.Service.RecipientService;
import com.omg.OMG.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipientController {

    @Autowired
    private RecipientService recipientService;
    @Autowired
    RecipientRepo recipientRepo;

    @GetMapping("/getAllRecipient")
    public List<Recipient> getAllRecipient() {

        return recipientService.getAllRecipient();
    }


    @PostMapping("/addRecipient")
    public Recipient CreateRecipient(@RequestBody Recipient recipient) {

        return recipientService.createRecipient(recipient);
    }


    @DeleteMapping("/deleteRecipient/{id}")
    public  String deleteRecipient(@PathVariable String id) {

        recipientRepo.deleteById(id);

        return id + " Recipient Deleted!";
    }


}


