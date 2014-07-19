package org.yp.proxy;

/**
 * Created by peng.y on 2014/7/13.
 */
public class CountMain {
    public static void main(String[] args){
        Count count = new ProxyCount(new RealCount());
        count.queryCount();
        count.updateCount();
    }
}
