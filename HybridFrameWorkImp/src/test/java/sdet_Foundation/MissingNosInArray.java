package sdet_Foundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class MissingNosInArray {

	@Test
	public void test1() {
		int[] num = { 0, 1, 2 };
		int missingNo = missingNo(num);
		System.out.println(missingNo);
		Assert.assertEquals(3, missingNo);
		
	}

	//@Test
	public void test2() {
		int[] num = { 9,6,4,2,3,5,7,0,1 };
		int missingNo = missingNo(num);
		System.out.println(missingNo);
		Assert.assertEquals(8, missingNo);
		
	}

	
	
	
	public int missingNo(int[] num) {

		Arrays.sort(num);

		int size = num.length;

		for (int i = 0; i <= num.length; i++) {

			if(i==size) {
				return size;
			}else if (num[i] != i) {
				return i;
			}
		}
		return 0;

	}

}
