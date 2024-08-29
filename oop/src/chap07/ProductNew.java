package oop.src.chap07;

public class ProductNew {
    private String name;
    private int price;
    private String category;

    public ProductNew(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }
  
    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}
