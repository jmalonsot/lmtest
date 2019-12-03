package com.java.lmtest;

import com.java.lmtest.Factory.ProductFactory;
import com.java.lmtest.types.Book;
import com.java.lmtest.types.Food;
import com.java.lmtest.types.Medical;
import com.java.lmtest.types.Product;

import java.math.BigDecimal;

public class SalesTaxes {


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



    public void ConvertLine (String line) {

        String[] word = line.split("at");
        String amountNameProduct = word[0];
        String priceProduct = word[1];
        String[] amountNameProductSplit = amountNameProduct.split(" ");
        String numberProduct=amountNameProductSplit[0];
        String nameProduct = amountNameProduct.substring(numberProduct.length());
        ProductFactory productFactory = new ProductFactory();

        Product productType= productFactory.getProduct(nameProduct);
        productType.setPrice(priceProduct);
        System.out.println(nameProduct + ":" + productType.getPriceWithTax());


    }

    public String ConvertText (String text) {

        String[] lines = text.split("\n");
        String textResult="";
        for (int i=0; i<lines.length; i++) {
            String line = lines[i];
            ConvertLine (line);
        }

        return textResult;

    }




}
