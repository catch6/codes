package net.wenzuo.codes.designpattern.simplefactory;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class Main {

    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        Product product;

        product = factory.createProduct("A");
        product.use();

        product = factory.createProduct("B");
        product.use();
    }

}