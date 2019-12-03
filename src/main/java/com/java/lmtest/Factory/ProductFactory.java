package com.java.lmtest.Factory;

import com.java.lmtest.types.ImportProduct;
import com.java.lmtest.types.NoTaxProduct;
import com.java.lmtest.types.OtherProduct;
import com.java.lmtest.types.Product;

public class ProductFactory {




    public Product getProduct(String text) {
         if (isImport(text)) {

             return new ImportProduct();
         }
         else if (isNoTax(text)) {

            return new NoTaxProduct();
        }
        else  {
            return new OtherProduct();
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
