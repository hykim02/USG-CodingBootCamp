package oop.src.chap04;

public abstract class Product {
    protected String name;
    protected double price;

    public Product() {

    }
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String toString();
}
