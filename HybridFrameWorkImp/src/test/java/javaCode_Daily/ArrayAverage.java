package javaCode_Daily;

import java.util.Iterator;

public class ArrayAverage {

	public static int avg = 0;

	public static int AVG(int[] num) {

		int sum = 0;

		for (int i = 0; i < num.length; i++) {

			sum = sum + num[i];
			avg = sum / num.length;

		}
		// System.out.println(avg);
		return avg;
	}

	public static void main(String[] args) {
		int num[] = { 10, 20, 30, 40, 50 };

		AVG(num);

		System.out.println(avg);

	}
}
