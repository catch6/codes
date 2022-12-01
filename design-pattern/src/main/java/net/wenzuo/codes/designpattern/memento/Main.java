package net.wenzuo.codes.designpattern.memento;

/**
 * @author Catch
 * @since 2022-04-04
 */
public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        CareTaker careTaker = new CareTaker();

        editor.input("hello1");
        editor.input("hello2");
        careTaker.add(editor.saveToMemento());

        editor.input("hello3");
        careTaker.add(editor.saveToMemento());

        System.out.println("Current content: " + editor.getContent());
        editor.restoreFromMemento(careTaker.get(0));
        System.out.println("First saved content: " + editor.getContent());
        editor.restoreFromMemento(careTaker.get(1));
        System.out.println("Second saved content: " + editor.getContent());
    }

}