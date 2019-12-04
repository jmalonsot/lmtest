package com.java.lmtest.types;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BasicTaxProductTest {



    @Test
    public void testGetPriceWithTax() {

        BasicTaxProduct basicTaxProduct = new BasicTaxProduct();
        basicTaxProduct.setPrice(new BigDecimal("18.99"));
        BigDecimal result = basicTaxProduct.getPriceWithTax();
        assertEquals (new BigDecimal("20.89"), result);

    }

    @Test
    public void testGetTax() {

        BasicTaxProduct basicTaxProduct = new BasicTaxProduct();
        basicTaxProduct.setPrice(new BigDecimal("18.99"));
        BigDecimal result = basicTaxProduct.getTax();
        assertEquals (new BigDecimal("1.90"), result);

    }



}
