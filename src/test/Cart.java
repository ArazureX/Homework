package test;

import java.util.Objects;

public class Cart {
    private Product[] products = new Product[10];

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    public void cartInfo() {
        System.out.println("Cart: ");
        boolean isEmpty = true;
        int totalPrice = 0 ;
        for (Product i : products) {
            if(i != null){
                i.printInfo();
                isEmpty = false;
                totalPrice += i.getPrice();
            }
        }
        if(isEmpty){
            System.out.println("Cart is empty");
        }

        System.out.println("Total: " + totalPrice );
    }

    public void removeProduct(String productName){
        for (int i = 0; i < products.length; i++) {
            if((!Objects.isNull(products[i]))&&(Objects.equals(productName,products[i].getName()))){
                products[i] = null;
                break;
            }
        }
    }

}
