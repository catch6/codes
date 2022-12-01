package net.wenzuo.codes.designpattern.strategy;

import java.util.UUID;

/**
 * @author Catch
 * @since 2022-03-25
 */
public class UuidStrategy implements IdStrategy {

    @Override
    public String getId() {
        return UUID.randomUUID().toString();
    }

}