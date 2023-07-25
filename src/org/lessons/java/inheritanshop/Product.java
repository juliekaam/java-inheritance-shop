package org.lessons.java.inheritanshop;

import java.math.BigDecimal;
import java.util.Random;

public class Product {
    //Creare la classe Prodotto che gestisce i prodotti dello shop.

    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal iva;

    /*il codice prodotto sia accessibile solo in lettura
gli altri attributi siano accessibili sia in lettura che in scrittura
il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva formattato
*/
//costruttori


    public Product(int code){
        this.code = generateCode();
    }

    public Product(String name, String brand, BigDecimal price, BigDecimal iva) {
        this.code = generateCode();
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }
    //Metodi
    public BigDecimal partialPrice(){
        return price;
    }
    public BigDecimal totalPrice(){
        return partialPrice().add(iva.multiply(partialPrice()));
    }


    // metodo di utility che calcola il valore generato del codice
    private int generateCode() {
        Random random = new Random();
        return random.nextInt(1, 10000);
    }

    @Override
    public String toString() {
        return name +"-"+ code+"-"+ brand;
        }

    }

