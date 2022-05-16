package com.nhnacademy.money;

public class Money {
    protected long amount;

    @Override
    public boolean equals(Object obj){
        Money money = (Money) obj;
        return money.amount == this.amount;
    }
}
