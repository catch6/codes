package net.wenzuo.codes.designpattern.interpreter;

/**
 * @author Catch
 * @since 2022-04-07
 */
public class NumberExpression implements Expression {

    private long number;

    public NumberExpression(long number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Long.parseLong(number);
    }

    @Override
    public long interpret() {
        return this.number;
    }

}