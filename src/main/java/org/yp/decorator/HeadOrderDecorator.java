package org.yp.decorator;

public class HeadOrderDecorator extends OrderDecorator{

	public HeadOrderDecorator(Order order) {
		super(order);
	}

	public void print() {
		System.out.println("++++++Welcome++++++++");
		order.print();
	}
	

}
