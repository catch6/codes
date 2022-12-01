package net.wenzuo.codes.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Catch
 * @since 2022-04-04
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}