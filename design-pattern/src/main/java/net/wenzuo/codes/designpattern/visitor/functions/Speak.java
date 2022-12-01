package net.wenzuo.codes.designpattern.visitor.functions;

import net.wenzuo.codes.designpattern.visitor.objects.Cat;
import net.wenzuo.codes.designpattern.visitor.objects.Dog;
import net.wenzuo.codes.designpattern.visitor.interfaces.Operation;

/**
 * @author Catch
 * @since 2022-04-01
 */
public class Speak implements Operation {

    @Override
    public void operate(Dog dog) {
        System.out.println(dog.getName() + " is speaking...");
    }

    @Override
    public void operate(Cat cat) {
        System.out.println(cat.getName() + " is speaking...");
    }

}