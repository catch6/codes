package net.wenzuo.codes.designpattern.simplefactory;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class ProductFactory {

    public Product createProduct(String type) {
        Product product = null;
        if ("A".equals(type)) {
            product = new ProductA();
        } else if ("B".equals(type)) {
            product = new ProductB();
        }
        return product;
    }

}