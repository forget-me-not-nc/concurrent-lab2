package com.company;

public class Main {

    public static void main(String[] args) {
//        Counter counter = new Counter();
//
//        Thread one_inc = new Thread(() -> {
//            try {
//                while (true) {
//                    counter.increment();
//                    System.out.println("Thread one_inc: " + counter.value());
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        Thread two_inc = new Thread(() -> {
//            try {
//                while (true) {
//                    counter.increment();
//                    System.out.println("Thread two_inc: " + counter.value());
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        Thread one_dec = new Thread(() -> {
//            try {
//                while (true) {
//                    counter.decrement();
//                    System.out.println("Thread one_dec: " + counter.value());
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        Thread two_dec = new Thread(() -> {
//            try {
//                while (true)
//                {
//                    counter.decrement();
//                    System.out.println("Thread two_dec: " + counter.value());
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        one_inc.start();
//        two_inc.start();
//
//        one_dec.start();
//        two_dec.start();

        CustomCounter customCounter = new CustomCounter();

        Thread one_inc = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Thread one_inc: " + customCounter.increment_c1());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread two_inc = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Thread two_inc: " + customCounter.increment_c2());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        one_inc.start();
        two_inc.start();
    }
}