package org.yp.simplefactory;

/**
 * Created by peng.y on 2014/7/13.
 * 简单工厂模式，通过定义的枚举类型的type，为参数，来创建对应的Product实现类，是Phone还是PC
 */
public class ProductFactory {
    public enum ProductType{
        PHONE("phone"),PC("computer");

        private ProductType(String name){
            this.name = name;
        }
        private String name;

        public String getName() {
            return name;
        }
    }

    public static Product createProduct(ProductType type){
        if(type == ProductType.PC){
            return new PC("computer");
        }else if(type == ProductType.PHONE){
            return new Phone("phone");
        }else{
            return null;
        }
    }
}
