package net.wenzuo.codes.designpattern.proxy.bydynamic.bycglib;

/**
 * 使用 cglib 动态代理需要引入下面依赖
 * <pre>
 * {@code
 * <dependency>
 *     <groupId>cglib</groupId>
 *     <artifactId>cglib</artifactId>
 *     <version>3.3.0</version>
 * </dependency>
 * }
 * </pre>
 *
 * @author Catch
 * @since 2022-12-04
 */
public class Main {

    public static void main(String[] args) {
        UserService userService = (UserService) CglibProxyFactory.getProxy(UserService.class);
        boolean result = userService.login("admin", "admin");
        System.out.println("login result: " + result);
    }

}
