package pattern.singleton.before;

public class Main {
    public static void main(String[] args) {
        Cart cart1 = new Cart();

        cart1.addItem("apple");
        cart1.addItem("banana");

        cart1.printItems();

        Cart cart2 = new Cart();

        cart2.addItem("apple2");
        cart2.addItem("banana2");

        cart2.printItems();

    }
}
