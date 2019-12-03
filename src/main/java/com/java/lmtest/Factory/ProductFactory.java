package com.java.lmtest.Factory;

import com.java.lmtest.types.Book;
import com.java.lmtest.types.Product;

public class ProductFactory {




    public Product getProduct(String text) {
        if (isBook(text)) {

            return new Book();
        }
        //else {
        //    return new FacturaIvaReducido();
        //}
     return null;
    }

    public boolean isBook(String text) {
        boolean result = text.contains("book");
        return result;
    }

}
