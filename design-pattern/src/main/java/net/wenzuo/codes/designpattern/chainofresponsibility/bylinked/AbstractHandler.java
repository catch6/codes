package net.wenzuo.codes.designpattern.chainofresponsibility.bylinked;

/**
 * @author Catch
 * @since 2022-03-25
 */
public abstract class AbstractHandler {

    protected AbstractHandler next = null;

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    // 因为每个 AbstractHandler 都要执行的 next.handle(),
    // 所以这里使用模板模式提取出来，
    // 让每个 AbstractHandler 专注于业务逻辑
    public void handle() {
        // 如果需要阻止后续的 handler 则需要返回一个 boolean 值，
        // 根据 boolean 值判断是否需要执行后面的 handler
        this.doHandle();
        if (next != null) {
            next.handle();
        }
    }

    public abstract void doHandle();

}