package net.wenzuo.codes.designpattern.observer;

/**
 * @author Catch
 * @since 2022-02-28
 */
public class Observer1 implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Observer1:" + message);
    }

}