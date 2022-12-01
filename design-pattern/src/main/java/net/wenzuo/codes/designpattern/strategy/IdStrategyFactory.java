package net.wenzuo.codes.designpattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Catch
 * @since 2022-03-25
 */
public class IdStrategyFactory {

    private static final Map<IdStrategy.Type, IdStrategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put(IdStrategy.Type.UUID, new UuidStrategy());
        strategyMap.put(IdStrategy.Type.SNOW_FLAKE, new SnowFlakeStrategy());
    }

    public IdStrategy get(IdStrategy.Type type) {
        return strategyMap.get(type);
    }

}