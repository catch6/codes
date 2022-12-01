package net.wenzuo.codes.designpattern.prototype;

/**
 * @author Catch
 * @since 2022-04-11
 */
public class Circle extends Shape {

    public Circle(Integer id) {
        this.id = id;
        this.type = "circle";
    }

    @Override
    public void draw() {
        System.out.println("you are drawing " + type + "(id:" + id + ")");
    }

}