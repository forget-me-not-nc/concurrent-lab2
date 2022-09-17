package com.company;

/**
 * Created by IntelliJ IDEA.
 * lab2.CustomCounter
 *
 * @Author: Palijchuk Nazar
 * @DateTime: 17.09.2022|15:13
 * @Version CustomCounter: 1.0
 */

public class CustomCounter {
    private int counter1 = 0;
    private int counter2 = 0;

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public int increment_c1() throws InterruptedException {
        synchronized(lock1) {
            Thread.sleep(1000);
            return ++counter1;
        }
    }

    public int increment_c2() throws InterruptedException {
        synchronized(lock2) {
            Thread.sleep(2000);
            return ++counter2;
        }
    }
}