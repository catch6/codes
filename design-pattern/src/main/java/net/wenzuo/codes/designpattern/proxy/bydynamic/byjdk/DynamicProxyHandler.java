package net.wenzuo.codes.designpattern.proxy.bydynamic.byjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Catch
 * @since 2022-04-11
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object target;

    public DynamicProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long t1 = System.nanoTime();
        System.out.println(target.getClass().getSimpleName() + "." + method.getName() + " start");
        Object result = method.invoke(target, args);
        System.out.println(target.getClass().getSimpleName() + "." + method.getName() + " end");
        long t2 = System.nanoTime();
        System.out.println("time: " + (t2 - t1) + "ns");
        return result;
    }

}