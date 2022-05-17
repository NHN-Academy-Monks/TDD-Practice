package com.nhnacademy.money;

public abstract class Money {
    protected long amount;

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object obj){
        Money money = (Money) obj;

        return money.amount == this.amount
            && getClass().equals(money.getClass());
    }

    public abstract Money times(int multiplier);
}
