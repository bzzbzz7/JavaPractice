package com.zz.thinking.command;

import com.zz.thinking.command.device.Light;
import com.zz.thinking.command.device.Stereo;

public class ControlTest {
    public static void main(String[] args) {
        Control ctl;
        Light light = new Light("Bedroom");
        Stereo stereo = new Stereo();
        ctl = new TraditionControl(light, stereo);

        ctl.onButton(0);
        ctl.offButton(0);
        ctl.onButton(1);
        ctl.onButton(2);
        ctl.offButton(2);

        ctl.offButton(1);
    }
}
