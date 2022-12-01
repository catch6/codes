package net.wenzuo.codes.designpattern.observer.byjdk;

/**
 * @author Catch
 * @since 2022-03-03
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        NewsPaper newsPaper = new NewsPaper();
        Reader reader1 = new Reader("reader1");
        Reader reader2 = new Reader("reader2");
        Reader reader3 = new Reader("reader3");

        newsPaper.addObserver(reader1);
        newsPaper.addObserver(reader2);
        newsPaper.addObserver(reader3);
        newsPaper.setContent("hello");

        newsPaper.deleteObserver(reader3);
        newsPaper.setContent("hi");
    }

}