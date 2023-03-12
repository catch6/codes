package net.wenzuo.CreateObject;

/**
 * @author Catch
 * @since 2023-02-19
 */
public class MyObject implements Cloneable {

    public MyObject() {

    }

    private MyObject(String str, int num) {

    }

    public void print() {
        System.out.println("hello");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
