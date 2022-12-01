package net.wenzuo.codes.designpattern.bridge;

import net.wenzuo.codes.designpattern.bridge.color.Blue;
import net.wenzuo.codes.designpattern.bridge.color.Color;
import net.wenzuo.codes.designpattern.bridge.color.Red;
import net.wenzuo.codes.designpattern.bridge.shape.Circle;
import net.wenzuo.codes.designpattern.bridge.shape.Shape;
import net.wenzuo.codes.designpattern.bridge.shape.Square;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Main {

    public static void main(String[] args) {
        Shape shape;
        Color color;

        color = new Blue();
        shape = new Circle(color);
        shape.draw();

        color = new Red();
        shape = new Square(color);
        shape.draw();
    }

}