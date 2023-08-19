package sdet_Foundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class countNoOfElementPlusOne {

	@Test
	public void test1() {
		int[] input = { 1, 2, 3 };
		int findCountEle = FindCountEle(input);
		System.out.println(findCountEle);
		
		Assert.assertEquals(2, findCountEle);
	}
	
	@Test
	public void test2() {
		int[] input = { 1, 1, 3, 3, 5, 5, 7, 7 };
		int findCountEle = FindCountEle(input);
		System.out.println(findCountEle);
		Assert.assertEquals(0, findCountEle);
	}
	
	@Test
	public void test3() {
		int[] input = { 1, 1, 2};
		int findCountEle = FindCountEle(input);
		System.out.println(findCountEle);
		Assert.assertEquals(2, findCountEle);
	}


	public int FindCountEle(int[] input) {
		int count = 0;
		Arrays.sort(input);
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length; j++) {

				if (input[i] + 1 == input[j]) {
					count++;
				}
			}
		}
		return count;
	}
}
