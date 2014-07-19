package org.yp.proxy.dynamic;

/**
 * Created by peng.y on 2014/7/13.
 */
public class ProxyMain {
    public static void main(String[] args){
        BookFacadeProxy proxy = new BookFacadeProxy();
        BookFacade bookFacade = (BookFacade)proxy.bind(new BookFacadeImpl());
        bookFacade.addBook("java编程思想");
    }
}
