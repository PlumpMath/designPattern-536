package org.yp.command.radio;

/**
 * Created by yipeng on 2014/7/14.
 */
public class RewindCommand implements Command {
    private Radio radio;

    public RewindCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.rewind();
    }
}
