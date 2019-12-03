package com.java.lmtest.types;

import com.java.lmtest.SalesTaxes;

import java.math.BigDecimal;

public class OtherProduct extends Product {

    Tax taxes = new Tax();

    @Override
    public BigDecimal getPriceWithTax(){

        BigDecimal basicTax = taxes.BasicTax(getPrice());

        return taxes.RoundTax(basicTax).add(getPrice());

    }

    @Override
    public BigDecimal getTax(){

        BigDecimal importTax = taxes.BasicTax(getPrice());

        return importTax;

    }

}
