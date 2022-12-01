package net.wenzuo.codes.designpattern.abstractfactory.xiaomi;

import net.wenzuo.codes.designpattern.abstractfactory.AbstractTV;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class XiaomiTV extends AbstractTV {

    @Override
    public void watch() {
        System.out.println("You are watching [Xiaomi] TV");
    }

}