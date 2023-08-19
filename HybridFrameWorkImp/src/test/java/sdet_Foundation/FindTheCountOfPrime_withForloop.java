package sdet_Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class FindTheCountOfPrime_withForloop {

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

		int temp = num;
		int count = 0;
		while (temp >= 1) {
			if (temp <= 1) {

			}
			for (int i = 2; i < num; i++) {
				if (temp % i == 0) {

				}
			}
			temp--;
			count++;
			
		}
		return count;

	}

}
