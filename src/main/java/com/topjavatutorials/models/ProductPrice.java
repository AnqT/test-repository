/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topjavatutorials.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product_prices")
public class ProductPrice implements Serializable {
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="barcode")
    private long barcode;
    
    @Column(name="price")
    private double price;
    
    public ProductPrice(){
        
    }
    
    public ProductPrice(int _id, long _barcode, double _price){
        this.id = _id;
        this.barcode = _barcode;
        this.price = _price;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
