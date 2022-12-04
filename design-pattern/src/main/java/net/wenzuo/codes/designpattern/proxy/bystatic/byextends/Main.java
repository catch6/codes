package net.wenzuo.codes.designpattern.proxy.bystatic.byextends;

/**
 * @author Catch
 * @since 2022-04-11
 */
public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceProxy();
        boolean result = userService.login("admin", "admin");
        System.out.println("login result: " + result);
    }

}