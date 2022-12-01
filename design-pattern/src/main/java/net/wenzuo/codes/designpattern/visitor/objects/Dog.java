package net.wenzuo.codes.designpattern.visitor.objects;

import net.wenzuo.codes.designpattern.visitor.interfaces.Animal;
import net.wenzuo.codes.designpattern.visitor.interfaces.Operation;

/**
 * @author Catch
 * @since 2022-04-01
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void accept(Operation operation) {
        operation.operate(this);
    }

}