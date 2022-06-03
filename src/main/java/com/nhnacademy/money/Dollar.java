package com.nhnacademy.money;

public class Dollar extends Money {

    public Dollar(long amount, String currency) {
        super(amount, currency);
    }

    public Money times(int i) {
        return Money.dollar((int)(this.amount * i));
    }
}
