package com.ioay.javasamples.modifiers;

public class Product {

    private String productName;
    private int productId;
    private int productQuantity;

    /*
    * Generate automate with alt+insert getter and setter methods
    * */

    /*
    * Shadowing with this method at Constructor
    * */

    public Product(String productName, int productId, int productQuantity) {
        this.productName = productName;
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    /*
    * Encapsulation
    * */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
