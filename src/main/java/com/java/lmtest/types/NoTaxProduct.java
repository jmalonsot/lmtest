package com.java.lmtest.types;



import java.math.BigDecimal;

public class NoTaxProduct extends Product {


    @Override
    public BigDecimal getPriceWithTax(){

        return getPrice();
    }

    @Override
    public BigDecimal getTax(){

        return new BigDecimal(0);
    }






}
