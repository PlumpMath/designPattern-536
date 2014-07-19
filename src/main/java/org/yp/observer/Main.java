package org.yp.observer;

import java.util.Observer;

/**
 * Created by peng.y on 2014/7/13.
 */
public class Main {
    public static void main(String[] args){
        Teacher t = new Teacher("teacher");
        Student s1 = new Student("yipeng");
        Student s2 = new Student("kobe");
        t.addObserver(s1);
        t.addObserver(s2);
        System.out.println("-------begin--------");
        t.beginClass();
        System.out.println("-------end-------");
        t.endClass();
        System.out.println("--------remove s1----------");
        t.deleteObserver(s1);
        t.beginClass();
    }
}
