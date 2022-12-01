package net.wenzuo.codes.designpattern.factorymethod;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class ProductAFactory extends ProductFactory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }

}