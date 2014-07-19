package org.yp.command.radio;

/**
 * Created by yipeng on 2014/7/14.
 */
public class Juliy {
    public static void main(String[] args){
        Radio fmRadio = new Radio();
        Command playCommand = new PlayCommand(fmRadio);
        Command stopCommand = new StopCommand(fmRadio);
        Command rewindCommand =new RewindCommand(fmRadio);
        KeyBoard keyBoard = new KeyBoard(playCommand,stopCommand,rewindCommand);

        keyBoard.play();
        keyBoard.stop();
        keyBoard.rewind();

        keyBoard.stop();
        keyBoard.play();
        keyBoard.rewind();

    }
}
