package org.yp.command.theworld;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yipeng on 2014/7/14.
 */
public class TheWorld extends Frame implements ActionListener{
    private LetThereBeLightCommand beLightCommand;
    private LetThereBeLandCommand beLandCommand;
    private ResetCommand btnReset;
    private GodResetCommand btnExit;
    private Panel p;
    public TheWorld() {
        super("This is world,and God says.........");
        p = new Panel();
        p.setBackground(Color.black);

        add(p);
        beLightCommand = new LetThereBeLightCommand("Let there be light",p);
        beLandCommand = new LetThereBeLandCommand("Let there be land",p);
        btnReset = new ResetCommand("Reset",p);
        btnExit = new GodResetCommand("God Rests");
        p.add(beLightCommand);
        p.add(beLandCommand);
        p.add(btnReset);
        p.add(btnExit);
        beLightCommand.addActionListener(this);
        beLandCommand.addActionListener(this);
        btnReset.addActionListener(this);
        btnExit.addActionListener(this);
        setBounds(100,100,400,200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CommandFromGod command = (CommandFromGod)e.getSource();
        command.execute();
    }

    public static void main(String[] args){
        new TheWorld();
    }
}
