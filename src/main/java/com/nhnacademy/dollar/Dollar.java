package com.nhnacademy.dollar;

public class Dollar {
    private long amount;

    public Dollar(long amount) {
        this.amount = amount;
    }

    public Dollar times(int i) {
        return new Dollar(this.amount * i);
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Dollar){
            Dollar targetDollar = (Dollar) obj;
            if(targetDollar.amount == this.amount){
                return true;
            }
        }
        return false;
    }
}
