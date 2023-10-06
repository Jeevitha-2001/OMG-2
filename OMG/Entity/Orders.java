package com.omg.OMG.Entity;


import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "orders")
@Data

public class Orders {

    @Id
    @Basic

    private String Order_id;

    private Date Order_date;

    private String Cart_id;

    private String Recp_id;

    private String User_id;

    private String Vend_id;

}


  /*  Order_id varchar(100)  primary key,
    Order_date date not null,
        Cart_id varchar(100) not null,
        Recp_id varchar(100) not null,
        User_id varchar(100) not null,
        Vend_id varchar(100) not null,

   */