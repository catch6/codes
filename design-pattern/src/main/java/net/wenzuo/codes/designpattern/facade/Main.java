package net.wenzuo.codes.designpattern.facade;

import net.wenzuo.codes.designpattern.facade.account.AccountService;
import net.wenzuo.codes.designpattern.facade.account.AccountServiceImpl;
import net.wenzuo.codes.designpattern.facade.user.UserService;
import net.wenzuo.codes.designpattern.facade.user.UserServiceImpl;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        AccountService accountService = new AccountServiceImpl();

        Facade facade = new Facade(userService, accountService);

        UserVO userVO = facade.getUserVO();
        System.out.println(userVO);
    }

}