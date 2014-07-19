package org.yp.proxy;

/**
 * Created by peng.y on 2014/7/13.
 */
public class RealCount implements Count {
    @Override
    public void queryCount() {
        System.out.println("查看账户方法...");
    }

    @Override
    public void updateCount() {
        System.out.println("修改账户方法...");
    }
}
