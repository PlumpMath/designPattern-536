package org.yp.command;

/**
 * Created by yipeng on 2014/7/14.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
