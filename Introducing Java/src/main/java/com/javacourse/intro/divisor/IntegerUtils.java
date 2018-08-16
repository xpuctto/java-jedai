package com.javacourse.intro.divisor;

/**
 * Utility class to provide functionality for common divisor. 
 * and common multiples
 * @author Hristo Hristov
 *
 */
public final class IntegerUtils {

	/**
	 * Empty private constructor to avoid class instantiation.
	 */
	private IntegerUtils() {}
	
	/**
	 * Method for retrieving greatest common divisor of two given integers.
	 * @param a First number
	 * @param b Second number
	 * @return m The greatest common divisor of both numbers
	 */
	public static int greatestCommonDivisor(int a, int b) {
		int m = a;
		int n = b;

		while (m != n) {
			if (m > n) {
				m = m - n;
			} else {
				n = n - m;
			}
		}

		return m;
	}

	/**
	 * Method for retrieving the least common multiple of two given integers.
	 * @param a First integer
	 * @param b Second integer
	 * @return 0 or the least common multiple of both given numbers
	 */
	public static int leastCommonMultiple(int a, int b) {
		int m = a;
		int n = b;
		
		return (m == 0 || n == 0) ? 0 : (m * n) / greatestCommonDivisor(m, n);
	}
}
