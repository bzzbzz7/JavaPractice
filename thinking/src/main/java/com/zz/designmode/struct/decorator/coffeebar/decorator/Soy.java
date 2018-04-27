package com.zz.designmode.struct.decorator.coffeebar.decorator;

import com.zz.designmode.struct.decorator.coffeebar.Drink;

public class Soy extends Decorator {

    public Soy(Drink Obj) {
        super(Obj);
        // TODO Auto-generated constructor stub
        super.setDescription("Soy");
        super.setPrice(1.5f);
    }

}

