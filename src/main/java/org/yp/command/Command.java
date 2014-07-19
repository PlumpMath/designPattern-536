package org.yp.command;

/**
 * Created by yipeng on 2014/7/14.
 */
public interface Command {
    void execute();

    void undo();
}
