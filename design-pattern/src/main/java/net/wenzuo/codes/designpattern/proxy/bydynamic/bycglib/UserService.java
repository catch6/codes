package net.wenzuo.codes.designpattern.proxy.bydynamic.bycglib;

/**
 * @author Catch
 * @since 2022-04-11
 */
public class UserService {

    public boolean login(String username, String password) {
        System.out.println("username: " + username + ", password: " + password);
        return "admin".equals(username) && "admin".equals(password);
    }

}