package com.zz.designmode.structure.decorator.coffeebar.coffee;

import com.zz.designmode.structure.decorator.coffeebar.Drink;

public class Coffee extends Drink {

    @Override
    public float cost() {
        // TODO Auto-generated method stub
        return super.getPrice();
    }

}
