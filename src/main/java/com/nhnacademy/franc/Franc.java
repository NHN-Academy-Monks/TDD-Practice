package com.nhnacademy.franc;

public class Franc {
    private long amount;

    public Franc(long amount) {
        this.amount = amount;
    }

    public Franc times(int i){
        return new Franc(this.amount * i);
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Franc){
            Franc target = (Franc) obj;
            return target.amount == this.amount;
        }
        return false;
    }
}
