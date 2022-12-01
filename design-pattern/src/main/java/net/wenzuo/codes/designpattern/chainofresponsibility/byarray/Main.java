package net.wenzuo.codes.designpattern.chainofresponsibility.byarray;

/**
 * @author Catch
 * @since 2022-03-25
 */
public class Main {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new AHandler());
        chain.addHandler(new BHandler());
        chain.handle();
    }

}