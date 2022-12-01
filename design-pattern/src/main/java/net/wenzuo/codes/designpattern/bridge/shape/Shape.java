package net.wenzuo.codes.designpattern.bridge.shape;

import net.wenzuo.codes.designpattern.bridge.color.Color;

/**
 * @author Catch
 * @since 2022-04-12
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

}