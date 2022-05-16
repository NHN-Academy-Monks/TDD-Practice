package com.nhnacademy.dollar;

import static org.assertj.core.api.Assertions.assertThat;

import com.nhnacademy.franc.Franc;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DollarTest {
    @Test
    @DisplayName("프랑 곱하기")
    void testMultiplication() {
        Franc five = new Franc(5);
        assertThat(five.times(2)).isEqualTo(new Franc(10));
        assertThat(five.times(3)).isEqualTo(new Franc(15));
    }

    @Test
    @DisplayName("달러의 동치성(동일성)")
    void testEquality() {
        assertThat(new Dollar(5).equals(new Dollar(5))).isTrue();
        assertThat(new Dollar(5).equals(new Dollar(6))).isFalse();
    }
}
