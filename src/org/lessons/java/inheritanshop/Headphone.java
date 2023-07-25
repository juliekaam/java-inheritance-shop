package org.lessons.java.inheritanshop;

import java.math.BigDecimal;

public class Headphone extends Product {

    private  String color;
    private String connection;

    public Headphone(int code, String name, String brand, BigDecimal price, BigDecimal iva,String color,String connection) {
        super(name, brand, price, iva);
this.color=color;
this.connection=connection;


    }
    @Override
    public String toString() {
        return "Tv{name: " + getName() + "color: " + color + "connection :" +connection+"}";}

}
