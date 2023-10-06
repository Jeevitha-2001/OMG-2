package com.omg.OMG.Repository;

import com.omg.OMG.Entity.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipientRepo extends JpaRepository <Recipient,String> {

}
