package com.javacourse.intro.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

/**
 * Test class for testing for proper functionality of {@ArrayUtils} class' methods.
 * @author Hristo Hristov
 *
 */
class ArrayUtilsTest {

    /**
     * Test method for getMinElementIndex(int[]).
     */
    @Test
    void shouldGetMinElementIndex() {
        int[] array = new int[] {1, 2, 5, 0};

        Assertions.assertEquals(3, ArrayUtils.getMinElementIndex(array), "Method should return index of element with minimum value");
    }

    /**
     * Test method for getSum(int[]).
     */
    @Test
    void shouldPrintSumOfElements() {
        int[] array = new int[] {1, 2, 5, 0};

        Assertions.assertEquals(8, ArrayUtils.getSum(array), "Method should return sum of array elements");
    }

    /**
     * Test method for getMedian(int[]).
     */
    @Test
    void shouldReturnMedianOfArray() {
        int[] array1 = new int[] {4, 5, 99, -1, 5, 6};
        int[] array2 = new int[] {1, 2};
        int[] array3 = new int[] {1, 1, 1, 2, 1, 1000000};

        Assertions.assertEquals(2, ArrayUtils.getMedian(array1), "Method should return 2 when given 4, 5, 99, -1 ,5 , 6");
        Assertions.assertEquals(1, ArrayUtils.getMedian(array2), "Method should return 1 when given 1, 2");
        Assertions.assertEquals(5, ArrayUtils.getMedian(array3), "Method should return 5 when given 1, 1, 1, 2, 1, 1000000");
    }

    /**
     * Test method for quicksort
     */
    @Test
    void shouldSortArrayUsingQuicksort() {
        int[] arr = new int[] {9, 2, 4, 7, 3, 10};
        int[] sortedArray = new int[] {2, 3, 4, 7, 9, 10};

        ArrayUtils.quicksort(arr, 0, arr.length - 1);
        Assertions.assertTrue(Arrays.equals(arr, sortedArray), "Method should sort array using quicksort algorithm");
    }

    /**
     * Test method for reverseArray
     */
    @Test
    void shouldReverseValuesOfArray() {
        int[] arr = new int[] {1, 2, 3, 4};
        int[] reversedArr = new int[] {4, 3, 2, 1};

        Assertions.assertTrue(Arrays.equals(ArrayUtils.reverseArray(arr), reversedArr), "Method should reverse values of array");
    }
}
