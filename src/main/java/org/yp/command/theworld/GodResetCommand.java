package org.yp.command.theworld;

import java.awt.*;

/**
 * Created by yipeng on 2014/7/14.
 */
public class GodResetCommand extends Button implements CommandFromGod{
    public GodResetCommand(String label) {
        super(label);
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
