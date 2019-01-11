package com.javacourse.intro.arrays;

/**
 * Utility class providing extra functionality
 * when operating with arrays.
 * @author Hristo Hristov
 *
 */
public final class ArrayUtils {

    /**
     * Empty private constructor to prevent instantiating the class.
     */
    private ArrayUtils() {}

    /**
     * Method returning the index of the element with minimum value.
     * @param arr Array to find the minimum value element
     * @return minIndex The index of element with minimum value
     */
    public static int getMinElementIndex(int[] arr) {
        int[] array = arr;
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    /**
     * Method returning the sum of array elements.
     * @param arr Array
     * @return sum Sum of elements
     */
    public static int getSum(int[] arr) {
        int[] array = arr;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    /**
     * Method to retrieve the median of a given array.
     * @param arr Array to retrieve median from
     * @return median The median of the array
     */
    public static int getMedian(int[] arr) {
        int diff = 0;
        int median = 0;
        int leftSum = 0;
        int rightSum = getSum(arr);
        int delta = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            rightSum -= arr[i];
            diff = Math.abs(leftSum - rightSum);

            if (diff < delta) {
                median = i;
                delta = diff;
            }

            leftSum += arr[i];
        }

        return median;
    }

    /**
     * Reverses array values
     * @param arr Array
     * @return arr Same array, reversed values
     */
    public static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swapValues(arr, i,arr.length - i - 1);
        }

        return arr;
    }

    /**
     * Sorts an array using the quicksort algorithm
     * @param arr Array
     * @return arr Sorted array
     */
    public static void quicksort(int[]	arr, int startIndex, int endIndex) {
        int pivotIndex = partitionArray(arr, startIndex, endIndex);

        if (pivotIndex - 1 > startIndex) {
            quicksort(arr, startIndex, pivotIndex - 1);
        }

        if (pivotIndex + 1 < endIndex) {
            quicksort(arr, pivotIndex + 1, endIndex);
        }
    }

    /**
     * Partitions array based on pivot element
     * @param arr Array to be partitioned
     * @param startIndex Where partitioning begins
     * @param endIndex Where partitioning ends
     * @return pivotIndex Index of pivot element after partitioning
     */
    private static int partitionArray(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[endIndex];
        int pivotIndex = startIndex;

        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] < pivot) {
                swapValues(arr, pivotIndex, i);
                pivotIndex++;
            }
        }

        int temp = arr[pivotIndex];
        arr[pivotIndex] = pivot;
        arr[endIndex] = temp;

        return pivotIndex;
    }

    /**
     * Swaps values of two variables
     * @param indexValue1 First value index
     * @param indexValue2 Second value index
     */
    private static void swapValues(int[] arr, int indexValue1, int indexValue2) {
        int tmp = arr[indexValue1];

        arr[indexValue1] = arr[indexValue2];
        arr[indexValue2] = tmp;
    }
}
