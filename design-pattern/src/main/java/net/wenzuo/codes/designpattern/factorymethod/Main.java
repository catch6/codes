package net.wenzuo.codes.designpattern.factorymethod;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class Main {

    public static void main(String[] args) {
        ProductFactory factory;
        Product product;

        factory = new ProductAFactory();
        product = factory.createProduct();
        product.use();

        factory = new ProductBFactory();
        product = factory.createProduct();
        product.use();
    }

}