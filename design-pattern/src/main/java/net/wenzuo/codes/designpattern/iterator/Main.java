package net.wenzuo.codes.designpattern.iterator;

/**
 * @author Catch
 * @since 2022-04-01
 */
public class Main {

    public static void main(String[] args) {
        String[] names = {"liming", "xiaohua"};
        List list = new NameList(names);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }

}