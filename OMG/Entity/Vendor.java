package com.omg.OMG.Entity;


import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Vendor")
@Data


public class Vendor {

    @Id
    @Basic
    private String Vend_id;

    private String Vend_name;

    private String Vend_email;

    private String Vend_pwd;

    private Long Vend_phone;

    private String Vend_addr;
}
