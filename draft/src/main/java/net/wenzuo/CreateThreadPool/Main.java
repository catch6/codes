package net.wenzuo.CreateThreadPool;

import java.util.concurrent.*;

/**
 * 创建线程池的几种方法
 *
 * @author Catch
 * @since 2023-02-19
 */
public class Main {

    public static void main(String[] args) {
        // 使用 ThreadPoolExecutor 的构造函数
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 4, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000), new ThreadPoolExecutor.AbortPolicy());

        // 使用 Executors 提供的工厂方法
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        // 使用 ForkJoinPool 创建 Fork/Join 线程池
        ForkJoinPool forkJoinPool = new ForkJoinPool();

    }

}
