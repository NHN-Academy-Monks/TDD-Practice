package com.nhnacademy.money;

public class Dollar extends Money {
    public Dollar(long amount) {
        this.amount = amount;
    }

    public Dollar times(int i) {
        return new Dollar(this.amount * i);
    }
}
