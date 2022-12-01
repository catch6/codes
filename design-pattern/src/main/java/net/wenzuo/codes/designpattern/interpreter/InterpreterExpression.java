package net.wenzuo.codes.designpattern.interpreter;

/**
 * @author Catch
 * @since 2022-04-07
 */
public class InterpreterExpression implements Expression {

    private String expression;
    private Expression num1;
    private Expression num2;
    private Expression operator;

    public InterpreterExpression(String expression) {
        // 省略校验...
        this.expression = expression;
    }

    @Override
    public long interpret() {
        String[] expArr = expression.split("[+-]");
        num1 = new NumberExpression(expArr[0]);
        num2 = new NumberExpression(expArr[1]);
        if (expression.contains("+")) {
            operator = new AddExpression(num1, num2);
        } else if (expression.contains("-")) {
            operator = new SubtractExpression(num1, num2);
        }
        return operator.interpret();
    }

}