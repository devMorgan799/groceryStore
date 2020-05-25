package com.example.grocery_springboot.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "candy")
public class Candy {


    @Id
    @GeneratedValue
    @Column(name = "candy_id")
    private long candyId;


    @Column(name = "candy_name")
    private String candyName;

    @Column(name = "candy_price")
    private int candyPrice;


    public Candy() {
        super();
    }

    public Candy(String candyName, int candyPrice) {
        super();
        this.candyName = candyName;
        this.candyPrice = candyPrice;
    }

    public long getCandyId() {
        return candyId;
    }

    public void setCandyId(long candyId) {
        this.candyId = candyId;
    }


    public String getCandyName() {
        return candyName;
    }

    public void setCandyName(String candyName) {
        this.candyName = candyName;
    }

    public int getCandyPrice() {
        return candyPrice;
    }

    public void setCandyPrice(int candyPrice) {
        this.candyPrice = candyPrice;
    }

}
