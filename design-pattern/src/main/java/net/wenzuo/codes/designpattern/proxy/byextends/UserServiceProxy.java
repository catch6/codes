package net.wenzuo.codes.designpattern.proxy.byextends;

/**
 * @author Catch
 * @since 2022-04-11
 */
public class UserServiceProxy extends UserServiceImpl {

    @Override
    public boolean login(String username, String password) {
        long t1 = System.nanoTime();
        System.out.println("login start");
        boolean result = super.login(username, password);
        System.out.println("login end");
        long t2 = System.nanoTime();
        System.out.println("time: " + (t2 - t1) + "ns");
        return result;
    }

}