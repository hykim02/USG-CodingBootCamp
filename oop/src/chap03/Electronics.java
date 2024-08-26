package oop.src.chap03;

public class Electronics extends Product {
    
    private String manufacturer;

    // contructor
    public Electronics(String name, double price, int quantity, String manufacturer) {
        super(name, price, quantity); // 부모클래스 생성자 호출
        this.manufacturer = manufacturer; // 자식클래스 초기화
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void description() {
        // super.description();
        System.out.println(
            getName() + "상품의 가격은 " + 
            getPrice() + "원이고, 잔여 수량은 " + 
            getQuantity() + "개 입니다.");
    }

    public void description(boolean detail) {
        description();
        System.out.println("이 제품의 리뷰는 좋습니다.");
    }
    

}
