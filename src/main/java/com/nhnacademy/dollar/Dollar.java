package com.nhnacademy.dollar;

public class Dollar {
    public long amount;

    public Dollar(long amount) {
        this.amount = amount;
    }

    public void times(int i) {
        this.amount *= i;
    }
}
