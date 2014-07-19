package org.yp.simplefactory;

/**
 * Created by peng.y on 2014/7/13.
 */
public class Phone implements Product{
    private String name;

    public Phone(String name) {
        this.name = name;
    }

    @Override
    public String getProductName() {
        return this.name;
    }
}
