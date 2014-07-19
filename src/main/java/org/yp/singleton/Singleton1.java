package org.yp.singleton;

/**
 * Created by peng.y on 2014/7/13.
 * 饿汉模式,直接创建静态变量，不管后面有没有用到
 */
public class Singleton1{
    private  static Singleton1 instance = new Singleton1();
    private Singleton1(){}

    public static Singleton1 getInstance(){
        return instance;
    }
}
