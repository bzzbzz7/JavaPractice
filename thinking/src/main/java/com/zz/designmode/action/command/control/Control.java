package com.zz.designmode.action.command.control;

public interface Control {

    public void onButton(int slot);

    public void offButton(int slot);

    public void undoButton();
}
