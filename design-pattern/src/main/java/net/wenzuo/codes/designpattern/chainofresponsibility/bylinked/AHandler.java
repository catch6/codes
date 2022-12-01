package net.wenzuo.codes.designpattern.chainofresponsibility.bylinked;

/**
 * @author Catch
 * @since 2022-03-25
 */
public class AHandler extends AbstractHandler {

    @Override
    public void doHandle() {
        System.out.println("AHandler...");
    }

}