package org.lessons.java.inheritanshop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carello {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("INSERT NEW PRODUCT");

        // name
        System.out.print("Name: ");
        String nameInput = scan.nextLine();
        // description
        System.out.print("brand: ");
        String brandInput = scan.nextLine();
        // price
        System.out.print("Price: ");
        String priceStringInput = scan.nextLine();
        BigDecimal priceInput = new BigDecimal(priceStringInput);
        // vat
        System.out.print("iva: ");
        String ivaStringInput = scan.nextLine();
        BigDecimal ivaInput = new BigDecimal(ivaStringInput);

        // creo il nuovo prodotto
        Product yourproduct = new Product(nameInput, brandInput, priceInput, ivaInput);
        System.out.println(yourproduct);
String smartphone = "a";
String tv ="b";
        String headphone ="c";
String productType;
        System.out.println("which product is it: ");
         productType=scan.nextLine();

         if(productType.equals(smartphone)){
             System.out.println("insert IMEI");
             int imeicodeInput= scan.nextInt();
             System.out.println("insert memory");
             int memoryInput=scan.nextInt();

             Smartphone yourSmartphone= new Smartphone(nameInput,brandInput,priceInput,ivaInput,imeicodeInput,memoryInput);
             System.out.println(yourSmartphone);
         }










        }
    }
