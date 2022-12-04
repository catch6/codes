package net.wenzuo.codes.designpattern.proxy.bydynamic.byjdk;

import java.lang.reflect.Proxy;

/**
 * @author Catch
 * @since 2022-04-11
 */
public class DynamicProxy {

    public Object createProxy(Object target) {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(target);
        return Proxy.newProxyInstance(classLoader, interfaces, handler);
    }

}