package net.wenzuo.JdkProxy;

import java.lang.reflect.Proxy;

/**
 * @author Catch
 * @since 2023-03-09
 */
public class Main {

    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        MyProxy myProxy = new MyProxy(myObject);
        MyObject instance = (MyObject) Proxy.newProxyInstance(myObject.getClass().getClassLoader(), myObject.getClass().getInterfaces(), myProxy);
        instance.sayHello();
    }

}
