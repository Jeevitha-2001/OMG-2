package com.omg.OMG.Repository;

import com.omg.OMG.Entity.Customization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomizationRepo extends JpaRepository <Customization,String> {
}
