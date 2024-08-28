package oop.src.chap05;

public class Main {
    public static void main(String[] args) {
        Inventory lotteGangnam = new Inventory();
        lotteGangnam.addStock(new Food("매일우유", 1500, "2023-12-31"));
        lotteGangnam.addStock(new Clothing("티셔츠", 12000, "M"));
        lotteGangnam.addStock(new Food("초코우유", 2000, "2023-10-30"));

        System.out.println(lotteGangnam.search("매우유").toString());
    }
}
