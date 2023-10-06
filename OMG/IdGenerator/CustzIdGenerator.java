package com.omg.OMG.IdGenerator;

import com.omg.OMG.Repository.CustomizationRepo;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustzIdGenerator {

    @Autowired
    CustomizationRepo customizationRepo;

    public CustzIdGenerator(){}

    public String IdGenerator() throws HibernateException
    {
        String prefix ="CZ_";

        long CuztomizatonCount = customizationRepo.count();
        System.out.println(CuztomizatonCount);

        String Custz_id;
        Custz_id = prefix + String.format("%03d",++CuztomizatonCount);


        return Custz_id;
    }
}
