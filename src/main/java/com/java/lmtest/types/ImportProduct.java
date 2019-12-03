package com.java.lmtest.types;

import com.java.lmtest.SalesTaxes;

import java.math.BigDecimal;

public class ImportProduct extends Product {


    public boolean isImport(String text) {
        boolean result = text.startsWith("import");
        return result;
    }

    @Override
    public BigDecimal getPriceWithTax(){

        SalesTaxes salesTaxes = new SalesTaxes();

        BigDecimal importTax = salesTaxes.ImportTax(getPrice());

        return salesTaxes.RoundTax(importTax).add(getPrice());

    }

    @Override
    public BigDecimal getTax(){

        SalesTaxes salesTaxes = new SalesTaxes();

        BigDecimal importTax = salesTaxes.ImportTax(getPrice());

        return importTax;

    }
}
