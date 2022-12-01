package net.wenzuo.codes.designpattern.factorymethod;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class ProductBFactory extends ProductFactory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }

}