package com.omg.OMG.Entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Cart" )

public class Cart {
    @Id
    @Basic
    private String cart_id;
    private String custz_id;
    private int bill_amt;
    private int qty;

}
