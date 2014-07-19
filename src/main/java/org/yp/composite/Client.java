package org.yp.composite;

public class Client {
	public static void main(String[] args) {
		Graphics line1 = new Line();
		Graphics rectangle = new RectAngle();
		Graphics Circle = new Circle();
		Picture p = new Picture();
		p.add(line1);
		p.add(rectangle);
		p.add(Circle);
		p.draw();
	}
}
