package org.yp.command.radio;

/**
 * Created by yipeng on 2014/7/14.
 */
public class KeyBoard {
    Command playCommand;
    Command stopCommand;
    Command rewindCommand;

    public KeyBoard(Command playCommand,Command stopCommand,Command rewindCommand) {
        this.playCommand = playCommand;
        this.stopCommand = stopCommand;
        this.rewindCommand = rewindCommand;
    }


    public void play(){
        playCommand.execute();
    }

    public void stop(){
        stopCommand.execute();
    }

    public void rewind(){
        rewindCommand.execute();
    }

}
