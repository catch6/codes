package net.wenzuo.codes.designpattern.singleton.bystaticinnerclass;

import java.util.concurrent.atomic.AtomicLong;

/**
 * IdGeneratorHolder 是一个静态内部类，当外部类 IdGenerator 被加载的时候，
 * 并不会创建 IdGeneratorHolder 实例对象。
 * 只有当调用 getInstance() 方法时，IdGeneratorHolder 才会被加载，才会创建 instance。
 * instance 的唯一性、创建过程的线程安全性，都由 JVM 来保证。
 * 所以，这种实现方法既保证了线程安全，又能做到延迟加载。
 *
 * @author Catch
 * @since 2022-03-24
 */
public class IdGenerator {

    private IdGenerator() {
    }

    private static final class IdGeneratorHolder {

        private static final IdGenerator instance = new IdGenerator();

    }

    public static IdGenerator getInstance() {
        return IdGeneratorHolder.instance;
    }

    private final AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }

}