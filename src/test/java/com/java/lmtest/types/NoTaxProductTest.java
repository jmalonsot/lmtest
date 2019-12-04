package com.java.lmtest.types;


import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class NoTaxProductTest {



    @Test
    public void testGetPriceWithTax() {

        NoTaxProduct noTaxProduct = new NoTaxProduct();
        noTaxProduct.setPrice(new BigDecimal("11.25"));
        BigDecimal result = noTaxProduct.getPriceWithTax();
        assertEquals (new BigDecimal("11.25"), result);

    }

    @Test
    public void testGetTax() {

        NoTaxProduct noTaxProduct = new NoTaxProduct();
        noTaxProduct.setPrice(new BigDecimal("11.25"));
        BigDecimal result = noTaxProduct.getTax();
        assertEquals (new BigDecimal("0"), result);

    }

}
