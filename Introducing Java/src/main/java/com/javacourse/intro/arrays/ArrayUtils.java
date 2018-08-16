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
		int minValue = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] < minValue) {
				minIndex = i;
				minValue = array[i];
			}
		}

		return minIndex;
	}

	/**
	 * Method returning the index of the element with minimum value.
	 * @param arr Array to find the minimum value element
	 * @return minIndex The index of element with minimum value
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
}
