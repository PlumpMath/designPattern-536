package org.yp.command.theworld;

import java.awt.*;

/**
 * Created by yipeng on 2014/7/14.
 */
public class LetThereBeLightCommand extends Button implements CommandFromGod{
    private Panel p;
    public LetThereBeLightCommand(String caption,Panel p){
        super(caption);
        this.p = p;
    }
    @Override
    public void execute() {
        p.setBackground(Color.white);
    }
}
