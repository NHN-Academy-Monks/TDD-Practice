package com.nhnacademy.domain;

public class Money {

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

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    String currency() {
        return this.currency;
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return money.amount == amount
            && currency().equals(money.currency);
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
