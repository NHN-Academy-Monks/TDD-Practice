package com.nhnacademy.dollar;

public class Dollar {
    public long amount;

    public Dollar(long amount) {
        this.amount = amount;
    }

    public Dollar times(int i) {
        return new Dollar(this.amount * i);
    }
}
