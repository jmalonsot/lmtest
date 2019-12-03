package com.java.lmtest;

import com.java.lmtest.types.Tax;
import org.junit.Test;

import java.math.BigDecimal;


import static org.junit.Assert.assertEquals;

public class SalesTaxesTest {

    Tax taxes = new Tax();

    @Test
    public void testBasicTax () {

        BigDecimal result = taxes.BasicTax(new BigDecimal("15"));
        assertEquals (new BigDecimal("1.5"), result);

    }

    @Test
    public void testBasicRoundTax () {

        BigDecimal basicTax = taxes.BasicTax(new BigDecimal("14.99"));
        BigDecimal result = taxes.RoundTax(basicTax);
        assertEquals (new BigDecimal("1.50"), result);

    }

    @Test
    public void testImportTax () {

        BigDecimal result = taxes.ImportTax(new BigDecimal("47.50"));
        assertEquals (new BigDecimal("7.125"), result);

    }

    @Test
    public void testImportRoundTax () {

        BigDecimal importTax = taxes.ImportTax(new BigDecimal("47.50"));
        BigDecimal result = taxes.RoundTax(importTax);
        assertEquals (new BigDecimal("7.15"), result);

    }

    @Test
    public void testInput1 () {
    String input = "1 book at 12.49\n"
            + "1 music CD at 14.99\n"
            + "1 chocolate bar at 0.85\n";
    String output = "1 book: 12.49\n"
            + "1 music CD: 16.49\n"
            + "1 chocolate bar: 0.85\n"
            + "Sales Taxes: 1.50\n"
            + "Total: 29.83\n";

        SalesTaxes salesTaxes = new SalesTaxes();
        String outputResult = salesTaxes.ConvertText(input);
        assertEquals (output, outputResult);

    }





}
