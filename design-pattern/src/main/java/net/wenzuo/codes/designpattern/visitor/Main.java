package net.wenzuo.codes.designpattern.visitor;

import net.wenzuo.codes.designpattern.visitor.functions.Speak;
import net.wenzuo.codes.designpattern.visitor.objects.Cat;
import net.wenzuo.codes.designpattern.visitor.objects.Dog;
import net.wenzuo.codes.designpattern.visitor.functions.Jump;
import net.wenzuo.codes.designpattern.visitor.interfaces.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Catch
 * @since 2022-04-01
 */
public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Caca"));
        animals.add(new Dog("Dodo"));

        Jump jump = new Jump();
        for (Animal animal : animals) {
            animal.accept(jump);
        }

        Speak speak = new Speak();
        for (Animal animal : animals) {
            animal.accept(speak);
        }
    }

}