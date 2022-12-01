package net.wenzuo.codes.designpattern.observer;

/**
 * @author Catch
 * @since 2022-02-28
 */
public class Observer2 implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Observer2:" + message);
    }

}