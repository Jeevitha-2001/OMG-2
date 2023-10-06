package com.omg.OMG.Service;

import com.omg.OMG.Entity.Recipient;
import com.omg.OMG.Entity.User;
import com.omg.OMG.Repository.RecipientRepo;
import com.omg.OMG.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipientService {

    @Autowired
    private RecipientRepo recipientRepo;

    public Recipient createRecipient(Recipient recipient) {

        return recipientRepo.save(recipient);
    }

    public List<Recipient> getAllRecipient() {
        return recipientRepo.findAll();
    }

    public Recipient insertRecipient(Recipient recipient) {
        return recipientRepo.save(recipient);
    }


}
