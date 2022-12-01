package net.wenzuo.codes.designpattern.interpreter;

/**
 * @author Catch
 * @since 2022-04-07
 */
public class SubtractExpression implements Expression {

    private Expression exp1;
    private Expression exp2;

    public SubtractExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpret() {
        return exp1.interpret() - exp2.interpret();
    }

}