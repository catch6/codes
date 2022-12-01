package net.wenzuo.codes.designpattern.memento;

/**
 * @author Catch
 * @since 2022-04-04
 */
public class Memento {

    private String content;

    public Memento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}