package net.wenzuo.codes.designpattern.facade;

import java.math.BigDecimal;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class UserVO {

    private String username;
    private BigDecimal balance;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }

}