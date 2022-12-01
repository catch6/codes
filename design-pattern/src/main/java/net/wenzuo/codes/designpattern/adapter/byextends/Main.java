package net.wenzuo.codes.designpattern.adapter.byextends;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Main {

    public static void main(String[] args) {
        Target target = new Adaptor();
        target.methodA();
        target.methodB();
    }

}