package net.wenzuo.codes.designpattern.facade.account;

import java.math.BigDecimal;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class AccountServiceImpl implements AccountService {

    @Override
    public BigDecimal getBalance() {
        return new BigDecimal(10000000);
    }

}