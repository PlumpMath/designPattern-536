package org.yp.singleton;

/**
 * Created by peng.y on 2014/7/13.
 * double-checked，懒汉模式，通过使用时才创建。
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(instance == null){
            synchronized (Singleton2.class){
                if(instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
