package net.wenzuo.codes.designpattern.singleton.bylazy;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Catch
 * @since 2022-03-24
 */
public class IdGenerator {

    private IdGenerator() {
    }

    private static IdGenerator instance;

    public static IdGenerator getInstance() {
        if (instance == null) {
            synchronized (IdGenerator.class) {
                if (instance == null) {
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }

    private final AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }

}