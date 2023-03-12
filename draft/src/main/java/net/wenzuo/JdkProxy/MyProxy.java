package net.wenzuo.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Catch
 * @since 2023-03-09
 */
public class MyProxy implements InvocationHandler {

    private final MyObject target;

    public MyProxy(MyObject target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method " + method.getName());
        Object ret = method.invoke(target, args);
        System.out.println("after method " + method.getName());
        return ret;
    }

}
