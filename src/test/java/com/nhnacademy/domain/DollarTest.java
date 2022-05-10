package com.nhnacademy.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DollarTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);

        assertThat(five.amount).isEqualTo(10);
    }
}