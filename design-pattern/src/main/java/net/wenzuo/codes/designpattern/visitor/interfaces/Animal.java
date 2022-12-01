package net.wenzuo.codes.designpattern.visitor.interfaces;

/**
 * @author Catch
 * @since 2022-04-01
 */
public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void accept(Operation operation);

}