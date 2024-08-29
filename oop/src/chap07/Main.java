package oop.src.chap07;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList( // 값들을 묶어서 리스트로 만듦
            new Product("product1", 1000),
            new Product("product2", 2000),
            new Product("product3", 3000),
            new Product("product4", 4000),
            new Product("product5", 5000)
        );

        Predicate<Product> priceFilter = product -> product.getPrice() >= 3000;

        for(Product p : products) {
            if(priceFilter.test(p)) System.out.println(p.getName());
        }
    }
}
