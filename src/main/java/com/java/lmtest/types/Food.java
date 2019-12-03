package com.java.lmtest.types;

import java.math.BigDecimal;

public class Food extends Product {

    public boolean isFook(String text) {
        boolean result = text.startsWith("book");
        return result;
    }

    @Override
    public BigDecimal getPriceWithTax(){

        return getPrice();
    }

    @Override
    public BigDecimal getTax(){

        return new BigDecimal(0);
    }
}
