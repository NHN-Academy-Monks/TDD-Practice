package com.nhnacademy.dollar;

import static org.assertj.core.api.Assertions.assertThat;

import com.nhnacademy.money.franc.Franc;
import com.nhnacademy.money.Money;
import com.nhnacademy.money.dollar.Dollar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DollarTest {
    @Test
    @DisplayName("달러 곱하기")
    void testMultiplicationDollar() {
        Money five = Money.dollar(5);
        assertThat(five.times(2)).isEqualTo(Money.dollar(10));
        assertThat(five.times(3)).isEqualTo(Money.dollar(15));
    }
    @Test
    @DisplayName("프랑 곱하기")
    void testMultiplicationFranc() {
        Franc five = Money.franc(5);
        assertThat(five.times(2)).isEqualTo(Money.franc(10));
        assertThat(five.times(3)).isEqualTo(Money.franc(15));
    }

    @Test
    @DisplayName("Money 동치성(동등성)")
    void testEquality() {
        assertThat(Money.dollar(5).equals(Money.dollar(5))).isTrue();
        assertThat(Money.dollar(5).equals(Money.dollar(6))).isFalse();
        assertThat(Money.franc(5).equals(Money.franc(5))).isTrue();
        assertThat(Money.franc(5).equals(Money.franc(6))).isFalse();
        assertThat(Money.dollar(5).equals(Money.franc(5))).isFalse();
    }
}
