package org.yp.factory;

/**
 * Created by peng.y on 2014/7/13.
 */
public class FoodFactoryMain {
        public static void main(String[] args){
            FoodFactory foodFactory = new BeefFactory();
            Food beef = foodFactory.produceFood();
            System.out.printf(beef.getFoodName());
        }
}
