package org.yp.decorator;

public class Client {
	public static void main(String[] args) {
		SaleOrder saleOrder = new SaleOrder();
		Good g1 = new Good(123, "Milk  ", 19.4f);
		Good g2 = new Good(231, "cookie", 23.8f);
		Good g3 = new Good(124, "apple ", 45.0f);
		saleOrder.addGood(g1);
		saleOrder.addGood(g2);
		saleOrder.addGood(g3);
		Order order = new HeadOrderDecorator(
				new FoorOrderDecorator(saleOrder));
		order.print();
	}
}
