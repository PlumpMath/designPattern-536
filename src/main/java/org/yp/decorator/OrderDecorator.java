package org.yp.decorator;

public abstract class OrderDecorator implements Order{
	protected Order order;
	
	public OrderDecorator(Order order) {
		this.order = order;
	}
	
	
}
