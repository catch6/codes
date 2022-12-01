package net.wenzuo.codes.designpattern.interpreter;

/**
 * @author Catch
 * @since 2022-04-07
 */
public class Main {

    public static void main(String[] args) {
        String exp = "17+281";

        InterpreterExpression expression = new InterpreterExpression(exp);
        long result = expression.interpret();

        System.out.println(exp + "=" + result);
    }

}