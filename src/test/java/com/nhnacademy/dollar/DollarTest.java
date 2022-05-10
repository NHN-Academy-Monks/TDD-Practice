package com.nhnacademy.dollar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class DollarTest {
    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertThat(five.amount).isEqualTo(10);
    }
}
