package sdet_Foundation;

import org.junit.Test;

public class countPrimeNo {
	
	@Test
	public void test1() {
		
		int countPrimeNumber = countPrimeNumber(0);
		System.out.println(countPrimeNumber);
	}
	
	@Test
	public void test2() {
		
		int countPrimeNumber = countPrimeNumber(10);
		System.out.println(countPrimeNumber);
	}

	@Test
	public void test3() {
		
		int countPrimeNumber = countPrimeNumber(1);
		System.out.println(countPrimeNumber);
	}
	
	
	public int countPrimeNumber(int n) {
		int count= 0;
		while(n>0) {
			if(checkPrimeNumber(n)) {
				count++;
				
			}	
			n--;
		}
		return count;
	}
	
	public boolean checkPrimeNumber(int input) {
	
		if(input<=1) {
			return false;
		}		
		for(int i =2;i<input;i++) {
			if(input%i==0) {
				return false;
			}
		}
		return true;
		
	}
	

}
