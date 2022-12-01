package net.wenzuo.codes.designpattern.strategy;

/**
 * @author Catch
 * @since 2022-03-25
 */
public class SnowFlakeStrategy implements IdStrategy {

    @Override
    public String getId() {
        // 省略雪花算法...
        return "SnowFlakeId";
    }

}