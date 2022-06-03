package com.nhnacademy.money;

public class Money {
    protected long amount;
    protected String currency;

    public Money(long amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    @Override
    public boolean equals(Object obj){
        Money money = (Money) obj;

        return money.amount == this.amount
            && currency.equals(money.currency);
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }

    public String currency() {
        return this.currency;
    };
    @Override
    public String toString() {
        return "Money{" +
            "amount=" + amount +
            ", currency='" + currency + '\'' +
            '}';
    }
}
