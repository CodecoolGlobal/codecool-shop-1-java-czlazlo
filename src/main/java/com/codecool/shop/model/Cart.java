package com.codecool.shop.model;

import java.util.ArrayList;
import java.util.List;

public class Cart{
    private List<Product> cartProducts = new ArrayList<>();

    public List<Product> getCartProducts() {
        return cartProducts;
    }

    public void addToCartProduct(Product cartProduct) {
        cartProducts.add(cartProduct);
    }

    public void removeFromCart(Product cartProduct) {
        for (Product item: cartProducts) {
            if(item.getId()==cartProduct.getId()){
                cartProducts.remove(item);
            }
            System.out.println("No such item found in Cart.");
        }

    }
}
