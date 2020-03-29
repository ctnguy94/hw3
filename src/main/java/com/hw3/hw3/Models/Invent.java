package com.hw3.hw3.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="inventory")
public class Invent {
    @Id //primary
    @Column(name = "id") public int id;
    @Column(name = "description") public  String description;
    @Column(name = "price") public double price;
    @Column(name = "color") public  String color;
    public Invent() { }
    public Invent(int id, String description, double price, String color) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.color = color;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {

        this.id = id;
    }
    public String getDescription(){return description;}
    public void setDescription(String description){

        this.description=description;
    }
    public double getPrice(){return price;}
    public void setPrice(double price){

        this.price=price;
    }
    public String getColor(){return color;}
    public void setColor(String color){

        this.color=color;
    }
}
