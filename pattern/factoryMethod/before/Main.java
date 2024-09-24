package pattern.factoryMethod.before;

public class Main {
    public static void main(String[] args) {
        Cloth item = new Cloth();
        item.name = "shirt";
        item.price = 20.00;

        Electronic item2 = new Electronic();
        item2.name = "laptop";
        item2.price = 1000.0;

        System.out.println("cloth Item: " + item.name + " Price: " + item.price);
        System.out.println("electronic Item: " + item2.name + " Price: " + item2.price);
    }
}
