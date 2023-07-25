package org.lessons.java.inheritanshop;

import java.math.BigDecimal;

public class Tv extends Product {
    private int size;
    private Boolean smart;

    public Tv(int code, String name, String brand, BigDecimal price, BigDecimal iva,int size,
     Boolean smart) {
        super(name, brand, price, iva);
        this.size=size;
        this.smart=smart;

    }
    @Override
    public String toString() {
        return "Tv{name: " + getName() + "size : " + size + "smart :" +smart+"}";
}
}
