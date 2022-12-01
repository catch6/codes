package net.wenzuo.codes.designpattern.prototype;

/**
 * @author Catch
 * @since 2022-04-11
 */
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Shape clone = circle.clone();
        clone.draw();
    }

}