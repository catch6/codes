package net.wenzuo.codes.designpattern.observer.byjdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Catch
 * @since 2022-03-03
 */
public class Reader implements Observer {

    private final String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object message) {
        System.out.println(name + ": " + message);
    }

}