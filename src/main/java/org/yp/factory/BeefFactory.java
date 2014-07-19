package org.yp.factory;

/**
 * Created by peng.y on 2014/7/13.
 * 实现工厂接口。
 */
public class BeefFactory implements FoodFactory {

    @Override
    public Food produceFood() {
        return new Beef();
    }
}
