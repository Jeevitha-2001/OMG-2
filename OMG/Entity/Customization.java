package com.omg.OMG.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "customization")


public class Customization {

    @Id
    @Basic

    private String Custz_id;

    private String Custz_text;

    private String Custz_colour;
    private String Custz_shape;


    @Lob
    @Column(name = "Custz_img",length =30000)
    private byte[] Custz_img;
    @Transient
    private String Base64Image;


    private String Prod_id;

    public String getCustz_id() {
        return Custz_id;
    }

    public void setCustz_id(String Custz_id) {
        Custz_id = Custz_id;
    }


    public String getCustz_text() {
        return Custz_text;
    }

    public void setCustz_text(String custz_text) {
        custz_text = custz_text;
    }

    public String getCustz_colour() {
        return Custz_colour;
    }

    public void setCustz_colour(String custz_colour) {
        custz_colour = custz_colour;
    }

    public String getCustz_shape() {
        return Custz_shape;
    }

    public void setCustz_shape(String custz_shape) {
        custz_shape = custz_shape;
    }

    public byte[] getCustz_img() {
        return Custz_img;
    }

    public void setcustz_img(byte[] custz_img) {
        this.Custz_img = custz_img;
    }

    public String getprod_id() {
        return Prod_id;
    }

    public void setprod_id(String prod_id) {
        prod_id = prod_id;
    }

    public void setBase64Image(String base64Image) {
        Base64Image = base64Image;
    }

    public String getBase64Image() {
        return Base64Image;
    }
//    @Lob
//    @Column(name = "Custz_img",length =30000)
//    private byte[] Custz_img;
//    @Transient
//    private String Base64Image;
//private String Prod_id;

}


   /* Custz_id varchar(100) primary key,
    Custz_text varchar(100),
    Custz_colour varchar(100),
    Custz_shape varchar(100),
    Custz_img mediumblob,
    Prod_id varchar(100) not null,
        foreign key(Prod_id) REFERENCES omg.PRODUCT(Prod_id)
        );
  */