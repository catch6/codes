package net.wenzuo.codes.designpattern.memento;

/**
 * @author Catch
 * @since 2022-04-04
 */
public class Editor {

    private String content;

    public void input(String input) {
        content = input;
    }

    public String getContent() {
        return content;
    }

    public Memento saveToMemento() {
        return new Memento(content);
    }

    public void restoreFromMemento(Memento memento) {
        content = memento.getContent();
    }

}