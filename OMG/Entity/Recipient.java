package com.omg.OMG.Entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Data
@Table(name = "recipient")

public class Recipient {

    @Id
    @Basic

    private  String Recp_id;

    private String Recp_name;

    private String Recp_addr;

    private Long Recp_phone;


}
