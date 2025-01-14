package Practicum;


/*
1114. Print In Order https://leetcode.com/problems/print-in-order/
 */

import java.util.concurrent.Semaphore;

public class PrintInOrder {

    class Foo {
        Semaphore semaphore;

        public Foo() {
            semaphore = new Semaphore(0);
        }

        public void first(Runnable printFirst) throws InterruptedException {

            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            semaphore.release();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (!semaphore.tryAcquire(1)) ;
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            semaphore.release(2);
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (!semaphore.tryAcquire(2)) ;
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PrintInOrder printInOrder = new PrintInOrder();
        Foo foo = printInOrder.new Foo();
        foo.third(() -> System.out.print("third"));
        foo.first(() -> System.out.print("first"));
        foo.second(() -> System.out.print("second"));

    }
}
