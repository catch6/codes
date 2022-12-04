package net.wenzuo.codes.designpattern.proxy.bydynamic.bycglib;

/**
 * @author Catch
 * @since 2022-12-04
 */
public class Main {

    public static void main(String[] args) {
        UserService userService = (UserService) CglibProxyFactory.getProxy(UserService.class);
        boolean result = userService.login("admin", "admin");
        System.out.println("login result: " + result);
    }

}
