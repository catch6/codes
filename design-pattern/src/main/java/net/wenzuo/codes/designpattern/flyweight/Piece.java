package net.wenzuo.codes.designpattern.flyweight;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Piece {

    // 内部状态
    private String color;

    public Piece(String color) {
        this.color = color;
    }

    // 外部状态
    public void display(Location location) {
        System.out.println(color + "棋子: x=" + location.getX() + ", y=" + location.getY());
    }

    public String getColor() {
        return color;
    }

}