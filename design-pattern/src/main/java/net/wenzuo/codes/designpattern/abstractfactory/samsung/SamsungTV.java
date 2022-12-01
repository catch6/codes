package net.wenzuo.codes.designpattern.abstractfactory.samsung;

import net.wenzuo.codes.designpattern.abstractfactory.AbstractTV;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class SamsungTV extends AbstractTV {

    @Override
    public void watch() {
        System.out.println("You are watching [Samsung] TV");
    }

}