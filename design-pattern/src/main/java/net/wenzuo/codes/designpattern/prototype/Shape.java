package net.wenzuo.codes.designpattern.prototype;

/**
 * @author Catch
 * @since 2022-04-11
 */
public abstract class Shape implements Cloneable {

    protected Integer id;
    protected String type;

    public abstract void draw();

    @Override
    public Shape clone() {
        try {
            Shape clone = (Shape) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}