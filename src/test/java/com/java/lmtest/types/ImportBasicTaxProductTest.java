package com.java.lmtest.types;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ImportBasicTaxProductTest {



    @Test
    public void testGetPriceWithTax() {

        ImportBasicTaxProduct importBasicTaxProduct = new ImportBasicTaxProduct();
        importBasicTaxProduct.setPrice(new BigDecimal("27.99"));
        BigDecimal result = importBasicTaxProduct.getPriceWithTax();
        assertEquals (new BigDecimal("32.19"), result);

    }

    @Test
    public void testGetTax() {

        ImportBasicTaxProduct importBasicTaxProduct = new ImportBasicTaxProduct();
        importBasicTaxProduct.setPrice(new BigDecimal("27.99"));
        BigDecimal result = importBasicTaxProduct.getTax();
        assertEquals (new BigDecimal("4.20"), result);

    }


}
