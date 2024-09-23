package pattern.singleton.after;

public class Main {
    public static void main(String[] args) {
        Cart cart1 = Cart.getInstance();

        cart1.addItem("apple");
        cart1.addItem("banana");

        Cart cart2 = Cart.getInstance();

        cart2.addItem("apple2");
        cart2.addItem("banana2");

        cart2.printItems();

        // cart1, cart2 동일객체인지
        if (cart1 == cart2) {
            System.out.println("same");
        }
    }
}
