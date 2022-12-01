package net.wenzuo.codes.designpattern.bridge.shape;

import net.wenzuo.codes.designpattern.bridge.color.Color;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.paint("圆形");
    }

}