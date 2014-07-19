package org.yp.builder;

public class DogBuilder extends Builder{
	private Product p  = new Product();
	@Override
	protected void setName(String name) {
		p.setName(name);
	}

	@Override
	protected void addColor(String color) {
		p.setColor(color);
	}

	@Override
	protected void makeModel(String model) {
		p.setModel(model);
	}

	@Override
	public Product retrieveProduct() {
		return p;
	}

}
