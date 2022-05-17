package com.nhnacademy.money;

public class Franc extends Money {
    public Franc(long amount) {
        this.amount = amount;
    }


    @Override
    public Money times(int multiplier) {
            return new Franc(this.amount * multiplier);
    }
}
