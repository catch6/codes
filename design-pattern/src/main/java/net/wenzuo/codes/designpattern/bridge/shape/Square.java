package net.wenzuo.codes.designpattern.bridge.shape;

import net.wenzuo.codes.designpattern.bridge.color.Color;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.paint("正方形");
    }

}