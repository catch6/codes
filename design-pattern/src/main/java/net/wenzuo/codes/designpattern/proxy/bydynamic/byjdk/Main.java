package net.wenzuo.codes.designpattern.proxy.bydynamic.byjdk;

/**
 * @author Catch
 * @since 2022-04-11
 */
public class Main {

    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy();
        UserService userService = (UserService) proxy.createProxy(new UserServiceImpl());
        boolean result = userService.login("admin", "admin");
        System.out.println("login result: " + result);
    }

}