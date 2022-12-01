package net.wenzuo.codes.designpattern.adapter.bycomposite;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Main {

    public static void main(String[] args) {
        Source source = new Source();
        Target target = new Adaptor(source);
        target.methodA();
        target.methodB();
    }

}