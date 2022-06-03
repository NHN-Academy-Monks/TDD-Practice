package com.nhnacademy.domain;

public abstract class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    abstract Money times(int multiplier);

    String currency() {
        return this.currency;
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return money.amount == amount
            && getClass().equals(money.getClass());
    }
}
