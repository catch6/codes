package net.wenzuo.codes.designpattern.facade;

import net.wenzuo.codes.designpattern.facade.account.AccountService;
import net.wenzuo.codes.designpattern.facade.user.UserService;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Facade {

    private UserService userService;
    private AccountService accountService;

    public Facade(UserService userService, AccountService accountService) {
        this.userService = userService;
        this.accountService = accountService;
    }

    public UserVO getUserVO() {
        UserVO userVO = new UserVO();
        userVO.setUsername(userService.getUsername());
        userVO.setBalance(accountService.getBalance());
        return userVO;
    }

}