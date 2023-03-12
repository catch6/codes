package net.wenzuo.MultiThreadSerial;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Catch
 * @since 2023-03-08
 */
public class ByCyclicBarrier {

    public static void main(String[] args) {
        CyclicBarrier c2 = new CyclicBarrier(2);
        CyclicBarrier c3 = new CyclicBarrier(2);
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(200);
                System.out.println("t1");
                c2.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                c2.await();
                Thread.sleep(100);
                System.out.println("t2");
                c3.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                c3.await();
                Thread.sleep(50);
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t3");
        });
        t1.start();
        t2.start();
        t3.start();
    }

}
