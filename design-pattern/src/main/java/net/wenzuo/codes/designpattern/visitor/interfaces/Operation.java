package net.wenzuo.codes.designpattern.visitor.interfaces;

import net.wenzuo.codes.designpattern.visitor.objects.Cat;
import net.wenzuo.codes.designpattern.visitor.objects.Dog;

/**
 * @author Catch
 * @since 2022-04-01
 */
public interface Operation {

    void operate(Dog dog);

    void operate(Cat cat);

}