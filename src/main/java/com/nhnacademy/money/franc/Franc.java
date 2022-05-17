package com.nhnacademy.money.franc;

import com.nhnacademy.money.Money;

public class Franc extends Money {
    public Franc(long amount) {
        this.amount = amount;
    }

    public Franc times(int i){
        return new Franc(this.amount * i);
    }
}
