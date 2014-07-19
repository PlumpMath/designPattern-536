package org.yp.abstractfactory;

/**
 * Created by peng.y on 2014/7/13.
 */
public class USAChef implements Chef {

    @Override
    public Beef cookBeef() {
        return new USABeef();
    }

    @Override
    public Duck cookDuck() {
        return new USADuck();
    }
}
