package sdet_Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class FindTheCountOfPrime {

	@Test
	public void test1() {
		int prime = isPrime(5);
		System.out.println(prime);
		Assert.assertEquals(3, prime);
	}

	@Test
	public void test2() {
		int prime = isPrime(2);
		System.out.println(prime);
		Assert.assertEquals(0, prime);
	}

	@Test
	public void test3() {
		int prime = isPrime(10);
		System.out.println(prime);
		Assert.assertEquals(4, prime);
	}

	public int isPrime(int num) {

		
		int count = 0;
		for(int j =0; j<num;j++) {
			

		if (j <= 1) {
			
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				
			}
		}
		}
		return count++;

	}

}
