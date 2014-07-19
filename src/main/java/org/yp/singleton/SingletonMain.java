package org.yp.singleton;


import static org.junit.Assert.*;
/**
 * Created by peng.y on 2014/7/13.
 */
public class SingletonMain{
    public static void main(String[] args){
        Singleton1 s11 = Singleton1.getInstance();
        Singleton1 s12 = Singleton1.getInstance();
        assertEquals(s11==s12,true);

        Singleton2 s21 = Singleton2.getInstance();
        Singleton2 s22 = Singleton2.getInstance();
        assertEquals(s21==s22,true);

        Singleton3 s31 = Singleton3.getInstance();
        Singleton3 s32 = Singleton3.getInstance();
        assertEquals(s31 == s32,true);
    }
}
