package net.wenzuo.codes.designpattern.abstractfactory;

import net.wenzuo.codes.designpattern.abstractfactory.samsung.SamsungFactory;
import net.wenzuo.codes.designpattern.abstractfactory.xiaomi.XiaomiFactory;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory factory;
        AbstractTV tv;
        AbstractPhone phone;

        factory = new XiaomiFactory();
        tv = factory.createTV();
        phone = factory.createPhone();
        tv.watch();
        phone.use();

        factory = new SamsungFactory();
        tv = factory.createTV();
        phone = factory.createPhone();
        tv.watch();
        phone.use();
    }

}