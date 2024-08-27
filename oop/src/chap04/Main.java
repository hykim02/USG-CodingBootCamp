package oop.src.chap04;

public class Main {
    public static void main(String[] args) {
        Food f = new Food("Milk", 1000, "2025-01-01");
        Clothing c = new Clothing("Black T-shirt", 20000, "small");
        Sellable s = new Food("juice", 2000, "tomorrow");
        System.out.println(f.toString());
        System.out.println(c.toString());
        System.out.println(s.sell(10));
    }
}
