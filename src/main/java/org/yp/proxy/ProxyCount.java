package org.yp.proxy;

/**
 * Created by peng.y on 2014/7/13.
 */
public class ProxyCount implements Count{
    private Count count;

    public ProxyCount(Count count) {
        this.count = count;
    }

    @Override
    public void queryCount() {
        System.out.println("befor transaction");
        count.queryCount();
        System.out.println("after transaction");

    }

    @Override
    public void updateCount() {
        System.out.println("befor transaction");
        count.updateCount();
        System.out.println("after transaction");

    }
}
