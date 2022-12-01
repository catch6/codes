package net.wenzuo.codes.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Catch
 * @since 2022-03-03
 */
public class Subject {

    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}