package org.yp.composite;

import java.util.Vector;

public class Picture implements Graphics{
	private Vector<Graphics> list = new Vector<Graphics>();
	public void draw() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).draw();
		}
	}
	
	public synchronized void add(Graphics g){
		if(g == null){
			throw new NullPointerException();
		}
		list.add(g);
	}
	
	public synchronized void remove(Graphics g){
		list.remove(g);
	}
	
	public Graphics getChild(int i){
		if(i >= list.size()){
			throw new ArrayIndexOutOfBoundsException();
		}
		return list.get(i);
	}

}
