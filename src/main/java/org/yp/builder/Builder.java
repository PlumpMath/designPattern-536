package org.yp.builder;

public abstract class Builder {
	protected abstract void setName(String name);
	protected abstract void addColor(String color);
	protected abstract void makeModel(String model);
	public abstract Product retrieveProduct();
}
