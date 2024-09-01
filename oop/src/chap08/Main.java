package oop.src.chap08;

public class Main {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        pm.saveProduct(new Product("milk", 1000), "product.txt");

        Product p = null;
        p = pm.loadProduct("product.txt");
        System.out.println(p);
    }
}
