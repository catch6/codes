package net.wenzuo.codes.designpattern.state;

/**
 * @author Catch
 * @since 2022-04-01
 */
public class LowerCaseState implements WordState {

    @Override
    public String toString() {
        return "LowerCaseState";
    }

    @Override
    public void transfer(WordContext context) {
        System.out.println("start lower case transfer...");
        context.setWords(context.getWords().toLowerCase());
        context.setState(this);
    }

}