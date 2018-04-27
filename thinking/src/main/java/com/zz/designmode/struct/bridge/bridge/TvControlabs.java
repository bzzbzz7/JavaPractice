package com.zz.designmode.struct.bridge.bridge;

import com.zz.designmode.struct.bridge.control.Control;

public abstract class TvControlabs {

    Control mControl = null;

    public TvControlabs(Control mControl) {
        this.mControl = mControl;
    }

    public abstract void Onoff();

    public abstract void nextChannel();

    public abstract void preChannel();


}
