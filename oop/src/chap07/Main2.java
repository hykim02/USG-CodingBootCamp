package oop.src.chap07;

import java.util.*;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        List<ProductNew> products = Arrays.asList( // 값들을 묶어서 리스트로 만듦
            new ProductNew("product1", 1000, "Clothing"),
            new ProductNew("product2", 2000, "Clothing"),
            new ProductNew("product3", 3000, "Electronics"),
            new ProductNew("product4", 4000, "Food"),
            new ProductNew("product5", 5000, "Food")
        );

        Predicate<ProductNew> clothingFilter = p -> "Clothing".equals(p.getCategory());
        products.stream().filter(clothingFilter).forEach(p -> System.out.println("의류인 것: " + p.getName()));

        Predicate<ProductNew> priceFilter = p -> p.getPrice() >= 2000;
        products.stream().filter(priceFilter).forEach(p -> System.out.println("2000원이 넘는 것: " + p.getName()));

        products.stream().filter(clothingFilter).filter(priceFilter).forEach(p -> System.out.println("살아남은 것: " + p.getName()));
    }
}
