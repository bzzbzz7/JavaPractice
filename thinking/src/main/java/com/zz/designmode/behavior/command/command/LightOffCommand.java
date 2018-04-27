package com.zz.designmode.behavior.command.command;

import com.zz.designmode.behavior.command.device.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        light.Off();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        light.On();
    }

}
