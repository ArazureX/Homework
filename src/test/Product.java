package test;

public class Product {
    private String name ;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Name: "+ name + "\n Price: " + price);
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
