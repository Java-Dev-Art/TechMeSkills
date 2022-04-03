package com.tms;

import com.tms.model.Product;
import com.tms.utils.CRUDUtils;

public class Application {
    public static void main(String[] args) {
        Product product = new Product(5, "Vodka", "40%", 65.3, 12, true);
        System.out.println("Saved product:");
        System.out.println(CRUDUtils.saveProduct(product));
        System.out.println("---------------------------------------------------");

        System.out.println("All products:");
        System.out.println(CRUDUtils.getAllProducts());
        System.out.println("---------------------------------------------------");

        System.out.println("Updated product:");
        System.out.println(CRUDUtils.updateProduct(2, 30));
        System.out.println("----------------------------------------------------");

        System.out.println("Deleted product: ");
        System.out.println(CRUDUtils.deleteProduct(1));
    }
}
