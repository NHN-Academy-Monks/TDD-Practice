package com.nhnacademy.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DollarTest {

    @DisplayName("달러 객체 연산 후 값이 바뀌는 문제 해결")
//    @Test
    void testMultiplication() {
//        Dollar five = new Dollar(5);
//        Dollar product = five.times(2);
//        assertThat(10).isEqualTo(product);
//
//        product = five.times(3);
//        assertThat(15).isEqualTo(product);
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

    @Test
    @DisplayName("private 만들기")
    void testMultiplication_private() {
        Dollar five = new Dollar(5);
        Money product = five.times(2);
        assertThat(new Dollar(10)).isEqualTo(product);

        product = five.times(3);
        assertThat(new Dollar(15)).isEqualTo(product);
    }

    @Test
    @DisplayName("테스트 코드 리팩토링")
    void testMultiplication_refactor() {
        Money five = Money.dollar(5);
        assertThat(Money.dollar(10)).isEqualTo(five.times(2));
        assertThat(Money.dollar(15)).isEqualTo(five.times(3));
    }

    @Test
    public void tesFrancMultiplication() {
        Franc five = Money.franc(5);
        assertThat(Money.franc(10)).isEqualTo(five.times(2));
    }

    @Test
    @DisplayName("동등성2")
    void testEquality() {
        assertThat(Money.dollar(5).equals(Money.dollar(5))).isTrue();
        assertThat(Money.dollar(5).equals(Money.dollar(6))).isFalse();
        assertThat(new Franc(5).equals(Money.franc(5))).isTrue();
        assertThat(new Franc(5).equals(Money.franc(6))).isFalse();
        assertThat(Money.dollar(5).equals(Money.franc(5))).isFalse();
    }
}