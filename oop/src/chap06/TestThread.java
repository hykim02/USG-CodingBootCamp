package oop.src.chap06;

public class TestThread {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        MyThread m2 = new MyThread();
        m.start(); // 각각 다른 스레드 실행 
        m2.start();
    }
}
