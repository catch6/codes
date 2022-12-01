package net.wenzuo.codes.designpattern.observer.byjdk;

import java.util.Observable;

/**
 * @author Catch
 * @since 2022-03-03
 */
public class NewsPaper extends Observable {

    private String content;

    public void setContent(String content) {
        this.content = content;
        setChanged();
        notifyObservers(content);
    }

    public String getContent() {
        return content;
    }

}