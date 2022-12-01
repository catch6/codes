package net.wenzuo.codes.designpattern.abstractfactory.xiaomi;

import net.wenzuo.codes.designpattern.abstractfactory.AbstractPhone;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class XiaomiPhone extends AbstractPhone {

    @Override
    public void use() {
        System.out.println("You are using [Xiaomi] Phone");
    }

}