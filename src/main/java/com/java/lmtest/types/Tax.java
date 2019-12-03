package com.java.lmtest.types;

import java.math.BigDecimal;

public class Tax {

    public BigDecimal BasicTax (BigDecimal product) {

        return  new BigDecimal("10").multiply(product).divide(new BigDecimal("100"));

    }

    public BigDecimal ImportTax (BigDecimal product) {

        return  new BigDecimal("15").multiply(product).divide(new BigDecimal("100"));

    }

    public BigDecimal RoundTax (BigDecimal product) {

        double d = Math.round(product.doubleValue() * 20) / 20.0;

        return new BigDecimal(String.valueOf(d)).setScale(2);
    }
}
