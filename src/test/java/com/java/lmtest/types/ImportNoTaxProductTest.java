package com.java.lmtest.types;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ImportNoTaxProductTest {



    @Test
    public void testGetPriceWithTax() {

        ImportNoTaxProduct importNoTaxProduct = new ImportNoTaxProduct();
        importNoTaxProduct.setPrice(new BigDecimal("11.25"));
        BigDecimal result = importNoTaxProduct.getPriceWithTax();
        assertEquals (new BigDecimal("11.85"), result);

    }


}
