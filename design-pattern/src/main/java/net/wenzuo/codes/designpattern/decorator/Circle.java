package net.wenzuo.codes.designpattern.decorator;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }

}