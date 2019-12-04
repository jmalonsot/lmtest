package com.java.lmtest;

import com.java.lmtest.Factory.ProductFactory;
import com.java.lmtest.types.Product;

import java.math.BigDecimal;

public class SalesTaxes {

    BigDecimal totalPrice = new BigDecimal("0");

    BigDecimal totalTax= new BigDecimal("0");




    public String ConvertLine (String line) {

        int position = line.lastIndexOf("at");
        String priceProduct = line.substring(position+2);
        String amountNameProduct = line.substring(0, position);
        String[] amountNameProductSplit = amountNameProduct.toLowerCase().split(" ");
        String numberProduct=amountNameProductSplit[0];
        String nameProduct = amountNameProduct.substring(numberProduct.length());
        nameProduct = nameProduct.substring(0, nameProduct.length()-1);
        ProductFactory productFactory = new ProductFactory();

        Product productType= productFactory.getProduct(nameProduct);
        productType.setPrice(new BigDecimal(priceProduct.trim()));
        totalPrice = totalPrice.add(productType.getPriceWithTax());
        totalTax = totalTax.add(productType.getTax());
        //System.out.println(nameProduct + ":" + productType.getPriceWithTax());
        return numberProduct.trim()  + nameProduct + ": " + productType.getPriceWithTax() + "\n";

    }

    public String ConvertText (String text) {

        String[] lines = text.split("\n");
        String textResult="";
        for (int i=0; i<lines.length; i++) {
            String line = lines[i];
            textResult+=ConvertLine (line);
        }
        textResult+="Sales Taxes: "+totalTax.setScale(2, BigDecimal.ROUND_UP)+ "\n";
        textResult+="Total: "+totalPrice.setScale(2, BigDecimal.ROUND_UP)+ "\n";
        return textResult;

    }

}
