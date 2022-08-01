package test;

public class MainProduct {
    public static void main(String[] args) {
        Product product = new Product("Salad", 80);
        Product product1 = new Product("Bread", 26);
        Customer customer = new Customer("Maks");
        Customer customer1 = new Customer("Vlad");
//        product.printInfo();
        Cart cart = new Cart();
        customer.setCart(cart);

        customer.addProduct(product);
        customer1.setCart(customer.giveCart());
        customer.cartInfo();
        customer1.cartInfo();

    }
}
