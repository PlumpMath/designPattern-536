package org.yp.builder;

public class Client {
	/*
	 *Builder�����࣬���幹��Product��ÿһ���ֵĳ��󷽷������з���product�ķ����� 
	 * CatBuilder��DogBuilderΪʵ����
	 * Director���ͨ��Builder�����Productʵ��
	 */
	public static void main(String[] args) {
		Builder catBuilder = new CatBuilder();
		Director catDirector = new Director(catBuilder);
		Product cat  = catDirector.construct("mimi", "yellow", "cat");
		System.out.println(cat);
		
		Builder dogBuilder = new DogBuilder();
		Director dogDirector = new Director(dogBuilder);
		Product dog  = dogDirector.construct("wangwang", "black", "dog");
		System.out.println(dog);
		
	}
}
