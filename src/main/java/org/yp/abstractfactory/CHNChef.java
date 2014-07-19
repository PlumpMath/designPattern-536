package org.yp.abstractfactory;

/**
 * Created by peng.y on 2014/7/13.
 */
public class CHNChef implements Chef{
    @Override
    public Beef cookBeef() {
        return new CHNBeef();
    }

    @Override
    public Duck cookDuck() {
        return new CHNDuck();
    }
}
