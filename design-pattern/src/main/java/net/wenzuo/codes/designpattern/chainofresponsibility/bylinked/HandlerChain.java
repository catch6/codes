package net.wenzuo.codes.designpattern.chainofresponsibility.bylinked;

/**
 * @author Catch
 * @since 2022-03-25
 */
public class HandlerChain {

    // 头节点
    private AbstractHandler head = null;
    // 尾结点
    private AbstractHandler tail = null;

    public void addHandler(AbstractHandler handler) {
        handler.setNext(null);
        // 如果头节点为 null，说明第一次添加
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        // 头节点不为 null，说明至少添加过一次
        // 先把当前尾节点的 next 设置为 handler，再更新尾节点
        tail.setNext(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }

}