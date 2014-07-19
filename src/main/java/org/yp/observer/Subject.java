package org.yp.observer;

import java.util.Vector;

/**
 * Created by peng.y on 2014/7/13.
 */
public class Subject {
    private String name;
    private boolean changed = false;
    private Vector observers = null;

    public Subject(String name){
        this.name = name;
        observers = new Vector();
    }

    @Override
    public String toString() {
        return this.name;
    }

    public synchronized void addObserver(Observer observer){
        if(observer == null){

        }
        observers.add(observer);
    }

    public synchronized void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        notifyObservers(null);
    }

    public void notifyObservers(Object obj){
        Object[] arrLocal;
        synchronized (this){
            if(!changed){
                return;
            }
            arrLocal = observers.toArray();
            clearChanged();
        }

        for (int i = 0; i <arrLocal.length ; i++) {
            ((Observer)arrLocal[i]).update(this,obj);
        }
    }


    /**
     * Clears the observer list so that this object no longer has any observers.
     */
    public synchronized void deleteObservers() {
        observers.removeAllElements();
    }

    /**
     * Marks this <tt>Observable</tt> object as having been changed; the
     * <tt>hasChanged</tt> method will now return <tt>true</tt>.
     */
    protected synchronized void setChanged() {
        changed = true;
    }

    /**
     * Indicates that this object has no longer changed, or that it has
     * already notified all of its observers of its most recent change,
     * so that the <tt>hasChanged</tt> method will now return <tt>false</tt>.
     * This method is called automatically by the
     * <code>notifyObservers</code> methods.
     *
     * @see     java.util.Observable#notifyObservers()
     * @see     java.util.Observable#notifyObservers(java.lang.Object)
     */
    protected synchronized void clearChanged() {
        changed = false;
    }

    /**
     * Tests if this object has changed.
     *
     * @return  <code>true</code> if and only if the <code>setChanged</code>
     *          method has been called more recently than the
     *          <code>clearChanged</code> method on this object;
     *          <code>false</code> otherwise.
     * @see     java.util.Observable#clearChanged()
     * @see     java.util.Observable#setChanged()
     */
    public synchronized boolean hasChanged() {
        return changed;
    }

    /**
     * Returns the number of observers of this <tt>Observable</tt> object.
     *
     * @return  the number of observers of this object.
     */
    public synchronized int countObservers() {
        return observers.size();
    }

}
