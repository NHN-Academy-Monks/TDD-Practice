package com.nhnacademy.money.dollar;

import com.nhnacademy.money.Money;

public class Dollar extends Money {
    public Dollar(long amount) {
        this.amount = amount;
    }

    public Dollar times(int i) {
        return new Dollar(this.amount * i);
    }
}
