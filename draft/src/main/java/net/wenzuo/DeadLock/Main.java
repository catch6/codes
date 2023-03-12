package net.wenzuo.DeadLock;

/**
 * 死锁
 *
 * @author Catch
 * @since 2023-03-08
 */
public class Main {

    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 acquired lock 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
                synchronized (lock2) {
                    System.out.println("Thread 1 acquired lock 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 acquired lock 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
                synchronized (lock1) {
                    System.out.println("Thread 2 acquired lock 1");
                }
            }
        });

        t1.start();
        t2.start();
    }

}
