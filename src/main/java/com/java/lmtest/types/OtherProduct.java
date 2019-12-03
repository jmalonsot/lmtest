package com.java.lmtest.types;

import com.java.lmtest.SalesTaxes;

import java.math.BigDecimal;

public class OtherProduct extends Product {


    @Override
    public BigDecimal getPriceWithTax(){

        SalesTaxes salesTaxes = new SalesTaxes();

        BigDecimal basicTax = salesTaxes.BasicTax(getPrice());

        return salesTaxes.RoundTax(basicTax).add(getPrice());

    }

    @Override
    public BigDecimal getTax(){

        SalesTaxes salesTaxes = new SalesTaxes();

        BigDecimal importTax = salesTaxes.BasicTax(getPrice());

        return importTax;

    }

}
