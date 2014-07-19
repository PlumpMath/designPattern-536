package org.yp.proxy.dynamic;

/**
 * Created by peng.y on 2014/7/13.
 */
public class BookFacadeImpl implements BookFacade{
    @Override
    public void addBook(String name) {
        System.out.println("增加图书 :"+name);
    }
}
