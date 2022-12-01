package net.wenzuo.codes.designpattern.abstractfactory.samsung;

import net.wenzuo.codes.designpattern.abstractfactory.AbstractPhone;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class SamsungPhone extends AbstractPhone {

    @Override
    public void use() {
        System.out.println("You are using [Samsung] Phone");
    }

}