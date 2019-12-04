package com.java.lmtest.Factory;

import com.java.lmtest.types.*;

public class ProductFactory {




    public Product getProduct(String text) {
         if (isImport(text)) {

             if (isNoTax(text)) {

                 return new ImportNoTaxProduct();
             }
             else {
                 return new ImportBasicTaxProduct();
             }

         }
         else if (isNoTax(text)) {

            return new NoTaxProduct();
        }
        else  {
            return new BasicTaxProduct();
        }

    }

    public boolean isNoTax(String text) {
        boolean result = text.contains("book") || text.contains("chocolate") || text.contains("pills");
        return result;
    }


    public boolean isImport(String text) {
        boolean result = text.contains("import");
        return result;
    }
}
