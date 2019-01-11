package com.javacourse.intro.divisor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test class for checking the proper functionality of the {@IntegerUtils} class methods.
 * @author Hristo Hristov
 *
 */
class IntegerUtilsTest {

    /**
     * Test method checking the functionality of greatestCommonDivisor method.
     */
    @Test
    void shouldfindGreatestCommonDivisorOfTwoIntegers() {
        Assertions.assertEquals(4, IntegerUtils.greatestCommonDivisor(20, 36), "Greatest common divisor of 20 and 36 should be 4");
    }

    /**
     * Test method checking the functionality of greatestCommonDivisor method.
     */
    @Test
    void shouldfindLeastCommonMultipleOfTwoIntegers() {
        Assertions.assertEquals(240, IntegerUtils.leastCommonMultiple(12, 80), "Least common multiple of 12 and 80 should be 240");
    }
}
