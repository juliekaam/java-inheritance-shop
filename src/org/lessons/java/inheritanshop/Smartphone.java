package org.lessons.java.inheritanshop;

import java.math.BigDecimal;

public class Smartphone extends Product {
     private int imeiCode;
     private int memory;

     public Smartphone(String name, String brand, BigDecimal price, BigDecimal iva, int imeiCode, int memory) {
          super(name, brand, price, iva);

          this.imeiCode=imeiCode;
          this.memory=memory;
     }

     @Override
     public String toString() {
          return "Smartphone{name: " + getName() + " imeicode : " + imeiCode +"  memory : " +memory+ "GB}";
     }
}
