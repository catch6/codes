package net.wenzuo.MultiThreadSerial;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Catch
 * @since 2023-03-08
 */
public class BySingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> System.out.println("t1"));
        executorService.submit(() -> System.out.println("t2"));
        executorService.submit(() -> System.out.println("t3"));
        executorService.shutdown();
    }

}
