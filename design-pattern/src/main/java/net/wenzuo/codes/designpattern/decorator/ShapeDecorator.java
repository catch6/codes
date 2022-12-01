package net.wenzuo.codes.designpattern.decorator;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class ShapeDecorator implements Shape {

    private Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("BorderColor: Red");
    }

}