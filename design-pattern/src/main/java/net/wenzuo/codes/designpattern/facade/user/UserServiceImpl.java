package net.wenzuo.codes.designpattern.facade.user;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class UserServiceImpl implements UserService {

    @Override
    public String getUsername() {
        return "Catch";
    }

}