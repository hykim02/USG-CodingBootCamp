package oop.src.chap03;

public class Main {
    public static void main(String[] args) {
        // Product a = new Product("마우스", 2000, 100);

        Electronics a = new Electronics("마우스", 2000, 100, "로지텍");
        // a.description();
        a.description(true);
    }
}
