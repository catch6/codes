package net.wenzuo.codes.designpattern.builder;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class Main {

    public static void main(String[] args) {
        User user = new User.Builder()
                .name("XiaoMing")
                .minAge(15)
                .maxAge(12)
                .build();
    }

}