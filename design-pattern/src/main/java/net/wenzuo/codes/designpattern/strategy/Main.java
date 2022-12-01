package net.wenzuo.codes.designpattern.strategy;

/**
 * @author Catch
 * @since 2022-03-25
 */
public class Main {

    public static void main(String[] args) {
        String id;
        IdStrategy strategy;

        strategy = new UuidStrategy();
        id = strategy.getId();
        System.out.println(id);

        strategy = new SnowFlakeStrategy();
        id = strategy.getId();
        System.out.println(id);

        // 结合工厂模式
        IdStrategyFactory factory = new IdStrategyFactory();

        strategy = factory.get(IdStrategy.Type.UUID);
        id = strategy.getId();
        System.out.println(id);

        strategy = factory.get(IdStrategy.Type.SNOW_FLAKE);
        id = strategy.getId();
        System.out.println(id);

    }

}