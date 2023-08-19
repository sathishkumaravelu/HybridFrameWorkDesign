package sdet_Foundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class NoOfOnes {

	@Test
	public void test1() {

		int[] input = { 0, 0, 1, 0, 1 };
		int countOnes = countOnes(input);
		System.out.println(countOnes);
		Assert.assertEquals(2, countOnes);

	}

	@Test
	public void test2() {

		int[] input = { 0, 1, 1, 1, 0, 1 };
		int countOnes = countOnes(input);
		System.out.println(countOnes);
		Assert.assertEquals(4, countOnes);
	}

	@Test
	public void test3() {

		int[] input = { 0, 0 };
		int countOnes = countOnes(input);
		System.out.println(countOnes);
		Assert.assertEquals(0, countOnes);
	}

	@Test
	public void test4() {

		int[] input = { 0, 0, 1 };
		int countOnes = countOnes(input);
		System.out.println(countOnes);
		Assert.assertEquals(1, countOnes);
	}

	public int countOnes(int[] input) {

		Arrays.sort(input);

		for (int i = 0; i < input.length; i++) {

			if (input[i] == 1) {
				return input.length - i;
			}

		}

		return 0;
	}

}
