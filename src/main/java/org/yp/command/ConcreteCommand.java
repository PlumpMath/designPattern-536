package org.yp.command;

/**
 * Created by yipeng on 2014/7/14.
 */
public class ConcreteCommand implements Command{
    private Receiver receiver;
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void undo() {

    }
}
