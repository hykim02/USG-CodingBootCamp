package oop.src.chap06;

import java.lang.Runnable;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().threadId() + " value " + i);
        }
    }
    
}
