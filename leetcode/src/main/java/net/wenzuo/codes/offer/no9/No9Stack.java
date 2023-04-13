package net.wenzuo.codes.offer.no9;

import java.util.Stack;

/**
 * @author Catch
 * @since 2023-03-19
 */
class No9Stack extends AbstractNo9 {

    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;

    No9Stack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    @Override
    void appendTail(int value) {
        stack1.push(value);
    }

    @Override
    int deleteHead() {
        if (stack2.empty()) {
            // 如果两个stack都为空,说明队列没有元素
            if (stack1.empty()) {
                return -1;
            }
            // 从stack1取出放入stack2,形成倒序
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
