package net.wenzuo.MultiThreadSerial;

import java.util.concurrent.CountDownLatch;

/**
 * @author Catch
 * @since 2023-03-08
 */
public class ByCountDownLatch {

    public static void main(String[] args) {
        CountDownLatch l2 = new CountDownLatch(1);
        CountDownLatch l3 = new CountDownLatch(1);
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t1");
            l2.countDown();
        });
        Thread t2 = new Thread(() -> {
            try {
                l2.await();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t2");
            l3.countDown();
        });
        Thread t3 = new Thread(() -> {
            try {
                l3.await();
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t3");
        });
        t1.start();
        t2.start();
        t3.start();
    }

}
