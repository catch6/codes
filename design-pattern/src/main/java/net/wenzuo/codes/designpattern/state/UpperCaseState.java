package net.wenzuo.codes.designpattern.state;

/**
 * @author Catch
 * @since 2022-04-01
 */
public class UpperCaseState implements WordState {

    @Override
    public String toString() {
        return "UpperCaseState";
    }

    @Override
    public void transfer(WordContext context) {
        System.out.println("do upper case transfer...");
        context.setWords(context.getWords().toUpperCase());
        context.setState(this);
    }

}