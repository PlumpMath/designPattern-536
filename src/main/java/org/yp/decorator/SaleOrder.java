package org.yp.decorator;

import java.util.ArrayList;
import java.util.List;

public class SaleOrder implements Order{
	private List<Good> goodList = new ArrayList<Good>();
	public void addGood(Good good){
		if(good != null){
			goodList.add(good);
		}
	}
	
	public void remove(Good good){
		goodList.remove(good);
	}
	
	public void print() {
		for (Good good:goodList) {
			System.out.println(good.getId()+"   "+good.getName() +"   $"+good.getPrice());
		}
	}

}
