package net.wenzuo.MultiThreadSerial;

import java.util.concurrent.Semaphore;

/**
 * @author Catch
 * @since 2023-03-08
 */
public class BySemaphore {

    public static void main(String[] args) {
        Semaphore s2 = new Semaphore(0);
        Semaphore s3 = new Semaphore(0);
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t1");
            s2.release();
        });
        Thread t2 = new Thread(() -> {
            try {
                s2.acquire();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t2");
            s3.release();
        });
        Thread t3 = new Thread(() -> {
            try {
                s3.acquire();
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
