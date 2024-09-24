package pattern.factoryMethod.after;

public class Main {
    public static void main(String[] args) {
        ProductFactory f1 = new ClothFactory();
        ProductFactory f2 = new ElectronicFactory();

        Product item = f1.createProduct("T", 10.00);
        Product item2 = f2.createProduct("TV", 1000.00);

        System.out.println("cloth Item: " + item.name + " Price: " + item.price);
        System.out.println("electronic Item: " + item2.name + " Price: " + item2.price);
    }
}
