package net.wenzuo.codes.designpattern.proxy.byinterface;

/**
 * @author Catch
 * @since 2022-04-11
 */
public class UserServiceImpl implements UserService {

    @Override
    public boolean login(String username, String password) {
        System.out.println("username: " + username + ", password: " + password);
        return "admin".equals(username) && "admin".equals(password);
    }

}