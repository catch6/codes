package net.wenzuo.codes.designpattern.decorator;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Main {

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();

        System.out.println("==========================");

        ShapeDecorator decorator = new ShapeDecorator(shape);
        decorator.draw();
    }

}