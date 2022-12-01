package net.wenzuo.codes.designpattern.singleton.byhurry;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Catch
 * @since 2022-03-24
 */
public class IdGenerator {

    private IdGenerator() {
    }

    private static final IdGenerator INSTANCE = new IdGenerator();

    public static IdGenerator getInstance() {
        return INSTANCE;
    }

    private final AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }

}