package com.java.lmtest.types;

import com.java.lmtest.SalesTaxes;

import java.math.BigDecimal;

public class ImportNoTaxProduct extends Product {

    Tax taxes = new Tax();

    @Override
    public BigDecimal getPriceWithTax(){

        BigDecimal importTax = taxes.ImportTax(getPrice());

        return taxes.RoundTax(importTax.add(getPrice()));

    }

    @Override
    public BigDecimal getTax(){

        BigDecimal importTax = taxes.ImportTax(getPrice());

        return taxes.RoundTax(importTax);

    }
}
