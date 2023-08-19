package sdet_Foundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class FizzBuzz {

	
	@Test
	public void test1() {
		String[] fizzBuss = fizzBuss(5);
		System.out.println(Arrays.toString(fizzBuss));
		String[] expected = {"1","2","Fizz", "4", "Buzz"};
		
		Assert.assertEquals(Arrays.toString(expected),Arrays.toString(fizzBuss));
	}
	
	@Test
	public void test2() {
		String[] fizzBuss = fizzBuss(3);
		System.out.println(Arrays.toString(fizzBuss));
		String[] expected = {"1","2","Fizz"};
		
		Assert.assertEquals(Arrays.toString(expected),Arrays.toString(fizzBuss));
	}
	
	@Test
	public void test3() {
		String[] fizzBuss = fizzBuss(15);
		System.out.println(Arrays.toString(fizzBuss));
		String[] expected = {"1","2","Fizz", "4", "Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
		
		Assert.assertEquals(Arrays.toString(expected),Arrays.toString(fizzBuss));
	}
	

	public String[] fizzBuss(int n) {

		String[] array = new String[n];

		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				array[i - 1] = "FizzBuzz";
			} else if (i % 3 == 0) {
				array[i - 1] = "Fizz";
			} else if (i % 5 == 0) {
				array[i - 1] = "Buzz";
			} else {
				array[i - 1] = i+"";
			}

		}

		return array;

	}

}
