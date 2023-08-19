package sdet_Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class IsogramCheck {

	@Test
	public void test1() {
		
		String input ="testleaf";
		boolean checkIsogram = checkIsogram(input);
		System.out.println(checkIsogram);
		Assert.assertEquals(false, checkIsogram);
	}
	
	@Test
	public void test2() {
		
		String input ="Stop";
		boolean checkIsogram = checkIsogram(input);
		System.out.println(checkIsogram);
		Assert.assertEquals(true, checkIsogram);
		
	}
	
	
	public boolean checkIsogram(String input) {
		
		char[] inputArray = input.toLowerCase().toCharArray();
		
		for (int i = 0; i < inputArray.length-1; i++) {
			for (int j = i+1; j < inputArray.length; j++) {
				
				if(inputArray[i]==inputArray[j]) {
					return false;
				}
			}
			
			
		}
		return true;
	}
	
}
