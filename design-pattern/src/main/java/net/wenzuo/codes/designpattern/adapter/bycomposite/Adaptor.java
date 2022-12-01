package net.wenzuo.codes.designpattern.adapter.bycomposite;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Adaptor implements Target {

    private Source source;

    public Adaptor(Source source) {
        this.source = source;
    }

    @Override
    public void methodA() {
        source.method1();
    }

    @Override
    public void methodB() {
        source.method2();
    }

}