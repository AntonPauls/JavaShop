package com.itproger.shop.models;

import jakarta.persistence.*;

//модель которая описует модель в базе данных
@Entity
public class Item {
    // Id, title, desc, image, price

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title, info, image;

    private short price;

    public Item() {
    }

    public Item(String title, String info, String image, short price) {
        this.title = title;
        this.info = info;
        this.image = image;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public short getPrice() {
        return price;
    }

    public void setPrice(short price) {
        this.price = price;
    }
}
