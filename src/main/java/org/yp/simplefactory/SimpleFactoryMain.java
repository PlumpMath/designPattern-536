package org.yp.simplefactory;

/**
 * Created by peng.y on 2014/7/13.
 */
public class SimpleFactoryMain {
    public static void main(String[] args){
        Product phone = ProductFactory.createProduct(ProductFactory.ProductType.PHONE);
        System.out.println(phone.getProductName());

        Product pc = ProductFactory.createProduct(ProductFactory.ProductType.PC);
        System.out.println(pc.getProductName());
    }
}
