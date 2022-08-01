package test;

import java.util.Objects;

public class Customer {
    private Cart cart;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void setCart(Cart cart) {
        this.cart = cart;

    }

    public void addProduct(Product product) {
        if (Objects.nonNull(cart)) {
            cart.addProduct(product);
        }
    }

    public void removeProduct(String productName) {
        if (Objects.nonNull(cart)) {
            cart.removeProduct(productName);
        }
    }

    public void cartInfo() {
        System.out.println(name);
        if (Objects.nonNull(cart)) {
            cart.cartInfo();
        }
    }

    public Cart giveCart() {
        Cart temp = cart;
        cart = null;
        return temp;

    }
}
