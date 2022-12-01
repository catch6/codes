package net.wenzuo.codes.designpattern.abstractfactory.samsung;

import net.wenzuo.codes.designpattern.abstractfactory.AbstractFactory;
import net.wenzuo.codes.designpattern.abstractfactory.AbstractPhone;
import net.wenzuo.codes.designpattern.abstractfactory.AbstractTV;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class SamsungFactory extends AbstractFactory {

    @Override
    public AbstractTV createTV() {
        return new SamsungTV();
    }

    @Override
    public AbstractPhone createPhone() {
        return new SamsungPhone();
    }

}