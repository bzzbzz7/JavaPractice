package com.zz.java.thinking.struct.bridge.bridge;

import com.zz.java.thinking.struct.bridge.control.Control;

public abstract class TvControlabs {

    Control mControl = null;

    public TvControlabs(Control mControl) {
        this.mControl = mControl;
    }

    public abstract void Onoff();

    public abstract void nextChannel();

    public abstract void preChannel();


}
