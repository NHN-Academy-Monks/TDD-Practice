package com.nhnacademy.money;

public class Franc extends Money {

    Franc(long amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(int multiplier) {
            return Money.franc((int)(this.amount * multiplier));
    }
}
