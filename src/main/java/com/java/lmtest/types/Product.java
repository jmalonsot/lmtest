package com.java.lmtest.types;

import java.math.BigDecimal;

public abstract class Product {

    private BigDecimal price;




    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public  abstract BigDecimal getPriceWithTax();

    public  abstract BigDecimal getTax();


}
