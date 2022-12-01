package net.wenzuo.codes.designpattern.flyweight;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Location {

    private Integer x;
    private Integer y;

    public Location(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

}