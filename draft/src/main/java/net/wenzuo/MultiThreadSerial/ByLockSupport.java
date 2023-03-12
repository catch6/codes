package net.wenzuo.MultiThreadSerial;

import java.util.concurrent.locks.LockSupport;

/**
 * @author Catch
 * @since 2023-03-08
 */
public class ByLockSupport {

    private static Thread t1, t2, t3;

    public static void main(String[] args) {
        t1 = new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t1");
            // 唤醒 t2
            LockSupport.unpark(t2);
        });
        t2 = new Thread(() -> {
            // 等待被唤醒
            LockSupport.park();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t2");
            LockSupport.unpark(t3);
        });
        t3 = new Thread(() -> {
            // 等待被唤醒
            LockSupport.park();
            try {
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
