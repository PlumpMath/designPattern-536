package org.yp.singleton;

/**
 * Created by peng.y on 2014/7/13.
 * 通过内部类实现懒汉模式，由jvm加载的规则实现创建时同步
 */
public class Singleton3 {

    private static class LazyHolder{
        private static final Singleton3 instance = new Singleton3();
    }

    private Singleton3(){}

    public static Singleton3 getInstance(){
        return LazyHolder.instance;
    }
}
