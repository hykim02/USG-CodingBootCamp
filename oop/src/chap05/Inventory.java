package oop.src.chap05;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// Product를 상속받은 클래스만 사용 가능 
public class Inventory<T extends Product> {
    private List<T> stock = new ArrayList<>();

    void addStock(T item) {
        stock.add(item);
    }

    T search(String name) {
        for (T item : stock) {
            if (item.name.equals(name)) {
                return item;
            }
        }
        throw new NoSuchElementException("찾는 상품이 없습니다.");
    }
}
