package com.omg.OMG.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="Product")

public class Product {

    @Id
    @Basic
    private String Prod_id;

    private String Prod_name;

    private Integer Prod_price;

    private String Prod_desc;


//    @Lob
//    @Column(name = "Prod_img")
    private byte[] Prodimg;
    @Transient
    private String Base64Image;
    private Boolean Is_custz;

    private String Vend_id;

    public Product() {
    }

    public Product(String prod_id, String prod_name, Integer prod_price, String prod_desc, byte[] prodimg, String base64Image, Boolean is_custz, String vend_id) {
        Prod_id = prod_id;
        Prod_name = prod_name;
        Prod_price = prod_price;
        Prod_desc = prod_desc;
        Prodimg = prodimg;
        Base64Image = base64Image;
        Is_custz = is_custz;
        Vend_id = vend_id;
    }

    public String getProd_id() {
        return Prod_id;
    }

    public void setProd_id(String prod_id) {
        Prod_id = prod_id;
    }

    public String getProd_name() {
        return Prod_name;
    }

    public void setProd_name(String prod_name) {
        Prod_name = prod_name;
    }

    public Integer getProd_price() {
        return Prod_price;
    }

    public void setProd_price(Integer prod_price) {
        Prod_price = prod_price;
    }

    public String getProd_desc() {
        return Prod_desc;
    }

    public void setProd_desc(String prod_desc) {
        Prod_desc = prod_desc;
    }

    public byte[] getProdimg() {
        return Prodimg;
    }

    public void setProdimg(byte[] prodimg) {
        Prodimg = prodimg;
    }

    public String getBase64Image() {
        return Base64Image;
    }

    public void setBase64Image(String base64Image) {
        Base64Image = base64Image;
    }

    public Boolean getIs_custz() {
        return Is_custz;
    }

    public void setIs_custz(Boolean is_custz) {
        Is_custz = is_custz;
    }

    public String getVend_id() {
        return Vend_id;
    }

    public void setVend_id(String vend_id) {
        Vend_id = vend_id;
    }
}
