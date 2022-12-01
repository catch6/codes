package net.wenzuo.codes.designpattern.adapter.byextends;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Adaptor extends Source implements Target {

    @Override
    public void methodA() {
        super.method1();
    }

    @Override
    public void methodB() {
        super.method2();
    }

}