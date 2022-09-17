package com.company;

/**
 * Created by IntelliJ IDEA.
 * lab2.Counter
 *
 * @Author: Palijchuk Nazar
 * @DateTime: 17.09.2022|14:55
 * @Version Counter: 1.0
 */

public class Counter {
    private int c = 0;

    public synchronized void increment() throws InterruptedException {
        int a;

        Thread.sleep(1000);

        a = c;
        a++;
        c = a;
    }

    public synchronized void decrement() throws InterruptedException {
        int a;

        Thread.sleep(1000);

        a = c;
        a--;
        c = a;
    }

    public int value() {
        return c;
    }
}