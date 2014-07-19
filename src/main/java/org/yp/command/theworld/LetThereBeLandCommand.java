package org.yp.command.theworld;

import java.awt.*;

/**
 * Created by yipeng on 2014/7/14.
 */
public class LetThereBeLandCommand extends Button implements CommandFromGod {
    private Panel  p;

    public LetThereBeLandCommand(String label, Panel p){
        super(label);
        this.p = p;
    }

    @Override
    public void execute() {
        p.setBackground(Color.yellow);
    }
}
