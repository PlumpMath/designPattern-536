package org.yp.abstractfactory;

/**
 * Created by peng.y on 2014/7/13.
 */
public class AbstractFactoryMain {
    public static void main(String[] args){
        Chef chineseChef = new CHNChef();
        Duck chnDuck = chineseChef.cookDuck();
        System.out.println(chnDuck.getDuckDescription());

        Beef chnBeef = chineseChef.cookBeef();
        System.out.println(chnBeef.getBeefDescription());


        Chef usaChef = new USAChef();
        Duck usaDuck = usaChef.cookDuck();
        System.out.println(usaDuck.getDuckDescription());

        Beef usaBeef = usaChef.cookBeef();
        System.out.println(usaBeef.getBeefDescription());

    }
}
