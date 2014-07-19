package org.yp.observer;

/**
 * Created by peng.y on 2014/7/13.
 */
public class Student implements Observer<Boolean>{

    public Student(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void update(Subject subject, Boolean arg) {
        if(arg){
            System.out.println(this.name+" hear "+subject.toString()+" say: begin class" );
        }else{
            System.out.println(this.name+" hear "+subject.toString()+" say: end class" );
        }
    }
}
