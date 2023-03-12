package net.wenzuo.MultiThreadSerial;

import lombok.SneakyThrows;

/**
 * @author Catch
 * @since 2023-03-08
 */
public class ByJoin {

    @SneakyThrows
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t1");
        });
        Thread t2 = new Thread(() -> {
            try {
                t1.join();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t2");
        });
        Thread t3 = new Thread(() -> {
            try {
                t2.join();
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
