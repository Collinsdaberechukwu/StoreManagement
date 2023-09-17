package org.collins_romeo_code;

import java.util.List;

public class Customer {
    private String name;
    private List<Product> cart;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    public void selectItem(Product product, int noOfItem){
        product.setUnit(noOfItem);
        product.setAmount(noOfItem * product.getUnit());
    }
}
