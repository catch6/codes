package net.wenzuo.codes.designpattern.chainofresponsibility.byarray;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Catch
 * @since 2022-03-25
 */
public class HandlerChain {

    private final List<AbstractHandler> handlers = new ArrayList<>();

    public void addHandler(AbstractHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (AbstractHandler handler : handlers) {
            // 如果需要截止则需要返回一个 boolean 值，
            // 根据 boolean 值判断是否需要执行后面的 handler
            handler.doHandle();
        }
    }

}