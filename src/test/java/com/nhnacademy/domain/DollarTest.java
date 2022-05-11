package com.nhnacademy.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DollarTest {

    @DisplayName("달러 객체 연산 후 값이 바뀌는 문제 해결")
    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(10).isEqualTo(product);

        product = five.times(3);
        assertThat(15).isEqualTo(product);
    }

    @DisplayName("동등성")
    @Test
    void testEquality1() {
        assertThat(new Dollar(5).equals(new Dollar(5))).isTrue();
    }

    @DisplayName("동등성")
    @Test
    void testEquality2() {
        assertThat(new Dollar(5).equals(new Dollar(5))).isTrue();
        assertThat(new Dollar(6).equals(new Dollar(5))).isFalse();
    }
}