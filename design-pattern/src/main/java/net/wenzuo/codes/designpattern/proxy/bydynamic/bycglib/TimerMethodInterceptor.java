package net.wenzuo.codes.designpattern.proxy.bydynamic.bycglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Catch
 * @since 2022-12-04
 */
public class TimerMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        long t1 = System.nanoTime();
        System.out.println(obj.getClass().getSimpleName() + "." + method.getName() + " start");
        // 执行目标方法
        Object result = proxy.invokeSuper(obj, args);
        System.out.println(proxy.getSuperName() + "." + method.getName() + " end");
        long t2 = System.nanoTime();
        System.out.println("time: " + (t2 - t1) + "ns");
        return result;
    }

}
