package org.yp.observer;

/**
 * Created by peng.y on 2014/7/13.
 */
public class Teacher extends Subject{
    private boolean isClass = false;

    public Teacher(String name) {
        super(name);
    }

    public void beginClass(){
        isClass = true;
        this.setChanged();
        notifyObservers(isClass);
    }

    public void endClass(){
        isClass = false;
        this.setChanged();
        notifyObservers(isClass);
    }
}
