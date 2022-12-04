package net.wenzuo.codes.designpattern.proxy.bystatic.byinterface;

/**
 * @author Catch
 * @since 2022-04-11
 */
public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean login(String username, String password) {
        long t1 = System.nanoTime();
        System.out.println("login start");
        boolean result = this.userService.login(username, password);
        System.out.println("login end");
        long t2 = System.nanoTime();
        System.out.println("time: " + (t2 - t1) + "ns");
        return result;
    }

}