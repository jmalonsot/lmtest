package com.java.lmtest.types;

import java.math.BigDecimal;

public class ImportBasicTaxProduct extends Product {

    Tax taxes = new Tax();

    @Override
    public BigDecimal getPriceWithTax(){

        BigDecimal importTax = taxes.ImportTax(getPrice());
        BigDecimal basicTax = taxes.BasicTax(getPrice());

        return taxes.RoundTax(importTax.add(basicTax)).add(getPrice());

    }

    @Override
    public BigDecimal getTax(){

        BigDecimal importTax = taxes.ImportTax(getPrice());
        BigDecimal basicTax = taxes.BasicTax(getPrice());

        return taxes.RoundTax(importTax.add(basicTax));

    }
}
