package net.wenzuo.codes.designpattern.state;

/**
 * @author Catch
 * @since 2022-04-01
 */
public class Main {

    public static void main(String[] args) {
        WordContext context = new WordContext();
        context.setWords("hello world!");

        LowerCaseState lowerCaseState = new LowerCaseState();
        lowerCaseState.transfer(context);
        System.out.println("state is: " + context.getState());
        System.out.println("words: " + context.getWords());

        UpperCaseState upperCaseState = new UpperCaseState();
        upperCaseState.transfer(context);
        System.out.println("state is: " + context.getState());
        System.out.println("words: " + context.getWords());

    }

}