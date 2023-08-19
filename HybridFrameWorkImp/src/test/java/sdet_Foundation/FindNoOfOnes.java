package sdet_Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class FindNoOfOnes {

	
	@Test
	public void test1() {
		int[] nums = {0,0,1,1,1,1,1,1};
		int count = findNoOfOnes(nums);
		System.out.println(count);
		Assert.assertEquals(6, count);
		
	}
	
	@Test
	public void test2() {
		int[] nums = {0,0,1,1,1,1,1};
		int count = findNoOfOnes(nums);
		System.out.println(count);
		Assert.assertEquals(5, count);
		
	}
	
	public int findNoOfOnes(int[] num) {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 1) {
				count++;
			}
		}

		return count;
	}
}
