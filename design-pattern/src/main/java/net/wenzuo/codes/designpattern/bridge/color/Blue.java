package net.wenzuo.codes.designpattern.bridge.color;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Blue extends Color {

    @Override
    public void paint(String shape) {
        System.out.println("蓝色的" + shape);
    }

}