package org.yp.simplefactory;

/**
 * Created by peng.y on 2014/7/13.
 */
public class PC implements Product{
    private String name;

    public PC(String name) {
        this.name = name;
    }

    @Override
    public String getProductName() {
        return this.name;
    }
}
