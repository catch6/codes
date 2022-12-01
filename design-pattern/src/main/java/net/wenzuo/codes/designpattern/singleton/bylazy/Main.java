package net.wenzuo.codes.designpattern.singleton.bylazy;

/**
 * @author Catch
 * @since 2022-03-24
 */
public class Main {

    public static void main(String[] args) {
        long id = IdGenerator.getInstance().getId();
    }

}