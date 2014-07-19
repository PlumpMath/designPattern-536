package org.yp.builder;

public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder ;
	}
	
	public Product construct(String name,String color,String model){
		builder.setName(name);
		builder.addColor(color);
		builder.makeModel(model);
		return builder.retrieveProduct();
	}
}
