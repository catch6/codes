package net.wenzuo.codes.designpattern.strategy;

/**
 * @author Catch
 * @since 2022-03-25
 */
public interface IdStrategy {

    String getId();

    enum Type {
        UUID,
        SNOW_FLAKE
    }

}