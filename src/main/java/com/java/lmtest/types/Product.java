package com.java.lmtest.types;

import java.math.BigDecimal;

public abstract class Product {

    private BigDecimal price;

    private String stringPrice;


    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.stringPrice = price;
        this.price = new BigDecimal(this.stringPrice);
    }

    public  abstract BigDecimal getPriceWithTax();

    public  abstract BigDecimal getTax();


}
