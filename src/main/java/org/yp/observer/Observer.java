package org.yp.observer;

/**
 * Created by peng.y on 2014/7/13.
 */
public interface Observer<T> {
    public void update(Subject subject,T arg);
}
