package com.java.lmtest.types;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TaxTest {



    @Test
    public void testBasicTax () {
        Tax taxes = new Tax();
        BigDecimal result = taxes.BasicTax(new BigDecimal("15"));
        assertEquals (new BigDecimal("1.5"), result);

    }

    @Test
    public void testBasicRoundTax () {
        Tax taxes = new Tax();
        BigDecimal basicTax = taxes.BasicTax(new BigDecimal("14.99"));
        BigDecimal result = taxes.RoundTax(basicTax);
        assertEquals (new BigDecimal("1.50"), result);

    }

    @Test
    public void testImportTax () {
        Tax taxes = new Tax();
        BigDecimal result = taxes.ImportTax(new BigDecimal("47.50"));
        assertEquals (new BigDecimal("2.375"), result);

    }

    @Test
    public void testImportRoundTax () {
        Tax taxes = new Tax();
        BigDecimal importTax = taxes.ImportTax(new BigDecimal("47.50"));
        BigDecimal result = taxes.RoundTax(importTax);
        assertEquals (new BigDecimal("2.40"), result);

    }
}
