package net.wenzuo.codes.designpattern.proxy.byinterface;

/**
 * @author Catch
 * @since 2022-04-11
 */
public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceProxy(new UserServiceImpl());
        boolean result = userService.login("admin", "admin");
        System.out.println("login result: " + result);
    }

}