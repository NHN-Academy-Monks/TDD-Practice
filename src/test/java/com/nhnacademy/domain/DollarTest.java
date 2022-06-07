package com.nhnacademy.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DollarTest {

    @Test
    @DisplayName("동등성")
    void testEquality() {
        assertThat(Money.dollar(5).equals(Money.dollar(5))).isTrue();
        assertThat(Money.dollar(5).equals(Money.dollar(6))).isFalse();
        assertThat(Money.dollar(5).equals(Money.franc(5))).isFalse();
    }

    @Test
    @DisplayName("통화 표현")
    void testCurrency() {
        assertThat("USD").isEqualTo(Money.dollar(1).currency());
        assertThat("CHF").isEqualTo(Money.franc(1).currency());
    }

    @Test
    void testSimpleAddition() {

        Money five = Money.dollar(5);

        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");

        assertThat(reduced).isEqualTo(Money.dollar(10));
    }
}