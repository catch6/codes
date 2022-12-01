package net.wenzuo.codes.designpattern.abstractfactory.xiaomi;

import net.wenzuo.codes.designpattern.abstractfactory.AbstractFactory;
import net.wenzuo.codes.designpattern.abstractfactory.AbstractPhone;
import net.wenzuo.codes.designpattern.abstractfactory.AbstractTV;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class XiaomiFactory extends AbstractFactory {

    @Override
    public AbstractTV createTV() {
        return new XiaomiTV();
    }

    @Override
    public AbstractPhone createPhone() {
        return new XiaomiPhone();
    }

}