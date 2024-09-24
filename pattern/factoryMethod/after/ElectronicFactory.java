package pattern.factoryMethod.after;

public class ElectronicFactory implements ProductFactory {

    @Override
    public Product createProduct(String name, double price) {
        Product result = new Electronic();
        result.name = name;
        result.price = price;
        return result;
    }
    
}
