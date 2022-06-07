package com.nhnacademy.money;

import com.nhnacademy.expression.Expression;

public class Money implements Expression {
    protected long amount;
    protected String currency;

    public Money(long amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
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

    public Expression plus(Money dollar) {
        return new Money(amount + dollar.amount, currency);
    }
}
