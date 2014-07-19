package org.yp.decorator;

public class FoorOrderDecorator extends OrderDecorator{

	public FoorOrderDecorator(Order order) {
		super(order);
	}

	public void print() {
		order.print();
		System.out.println("                    Thank You!");
	}

}
