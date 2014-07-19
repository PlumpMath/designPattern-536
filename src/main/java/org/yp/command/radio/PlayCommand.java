package org.yp.command.radio;

/**
 * Created by yipeng on 2014/7/14.
 */
public class PlayCommand implements Command {
    private Radio radio;

    public PlayCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.play();
    }
}
