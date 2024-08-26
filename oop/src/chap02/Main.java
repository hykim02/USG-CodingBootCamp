package oop.src.chap02;

public class Main {
    public static void main(String[] args) {
        // 기본 생성자
        // Product a = new Product();
        // a.setName("마우스");
        // a.setPrice(2000);
        // a.setQuantity(100);

        // 명시적 생성자
        Product a = new Product("마우스", 2000, 100);
        System.out.println(
            a.getName() + "상품의 가격은 " + 
            a.getPrice() + "원이고, 잔여 수량은 " + 
            a.getQuantity() + "개 입니다.");
    }
}
