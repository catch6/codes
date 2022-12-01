package net.wenzuo.codes.designpattern.observer;

/**
 * @author Catch
 * @since 2022-03-03
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.notifyObservers("hello");

        subject.removeObserver(observer2);
        subject.notifyObservers("hi");
    }

}