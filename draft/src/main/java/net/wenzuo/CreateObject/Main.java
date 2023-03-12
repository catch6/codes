package net.wenzuo.CreateObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 创建对象的几种方法
 *
 * @author Catch
 * @since 2023-02-19
 */
public class Main {

    public static void main(String[] args) {
        // 通过 new 关键字
        MyObject obj1 = new MyObject();

        // 通过 Class.forName().newInstance()
        try {
            Object obj2 = Class.forName("net.wenzuo.CreateObject.MyObject").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // 通过 MyObject.class.getConstructor()
        try {
            Constructor<MyObject> constructor = MyObject.class.getConstructor();
            MyObject obj3 = constructor.newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // 通过 MyObject.class.getDeclaredConstructor()
        // getConstructor() 不同的是 getDeclaredConstructor() 可以创建私有构造方法
        try {
            Constructor<MyObject> constructor = MyObject.class.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            MyObject obj4 = constructor.newInstance("hello", 1);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // 通过对象的 clone() 方法
        try {
            MyObject obj4 = (MyObject) obj1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }

}
