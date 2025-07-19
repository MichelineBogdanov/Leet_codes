package ru.bogdanov.print_in_order_1114;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class PrintInOrder {

    public static void main(String[] args) {
        Foo foo = new Foo();

        Thread second = new Thread(() -> {
            try {
                foo.second(() -> System.out.println("second"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread = new Thread(() -> {
            try {
                foo.third(() -> System.out.println("third"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread first = new Thread(() -> {
            try {
                foo.first(() -> System.out.println("first"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        first.start();
        second.start();
        thread.start();
    }

}

class Foo {

    private final CountDownLatch cdl = new CountDownLatch(3);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        while (cdl.getCount() != 3) {
            cdl.await(1, TimeUnit.MILLISECONDS);
        }
        printFirst.run();
        cdl.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        while (cdl.getCount() != 2) {
            cdl.await(1, TimeUnit.MILLISECONDS);
        }
        printSecond.run();
        cdl.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        while (cdl.getCount() != 1) {
            cdl.await(1, TimeUnit.MILLISECONDS);
        }
        printThird.run();
        cdl.countDown();
    }
}
