package net.wenzuo.codes.designpattern.state;

/**
 * @author Catch
 * @since 2022-04-01
 */
public interface WordState {

    void transfer(WordContext context);

}