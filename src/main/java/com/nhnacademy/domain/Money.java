package com.nhnacademy.domain;

public abstract class Money {

    protected int amount;

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    static Franc franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return money.amount == amount
            && getClass().equals(money.getClass());
    }
}
