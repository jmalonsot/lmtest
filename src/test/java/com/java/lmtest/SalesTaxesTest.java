package com.java.lmtest;

import org.junit.Test;

import java.math.BigDecimal;


import static org.junit.Assert.assertEquals;

public class SalesTaxesTest {

    @Test
    public void testBasicTax () {
        SalesTaxes salesTaxes = new SalesTaxes();
        BigDecimal result = salesTaxes.BasicTax(new BigDecimal("15"));
        assertEquals (new BigDecimal("1.5"), result);

    }

    @Test
    public void testBasicRoundTax () {
        SalesTaxes salesTaxes = new SalesTaxes();
        BigDecimal basicTax = salesTaxes.BasicTax(new BigDecimal("14.99"));
        BigDecimal result = salesTaxes.RoundTax(basicTax);
        assertEquals (new BigDecimal("1.50"), result);

    }

    @Test
    public void testImportTax () {
        SalesTaxes salesTaxes = new SalesTaxes();
        BigDecimal result = salesTaxes.ImportTax(new BigDecimal("47.50"));
        assertEquals (new BigDecimal("7.125"), result);

    }

    @Test
    public void testImportRoundTax () {
        SalesTaxes salesTaxes = new SalesTaxes();
        BigDecimal importTax = salesTaxes.ImportTax(new BigDecimal("47.50"));
        BigDecimal result = salesTaxes.RoundTax(importTax);
        assertEquals (new BigDecimal("7.15"), result);

    }

    @Test
    public void testInput1 () {
    String input = "1 book at 12.49\n"
            + "1 music CD at 14.99\n"
            + "1 chocolate bar at 0.85";

        SalesTaxes salesTaxes = new SalesTaxes();
        salesTaxes.ConvertText(input);

    }





}
