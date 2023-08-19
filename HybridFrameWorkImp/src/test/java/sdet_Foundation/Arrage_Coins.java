package sdet_Foundation;

import org.junit.Test;

public class Arrage_Coins {

	@Test
	public void test() {	
		int n=10;
		int arrangeCoins = arrangeCoins(n);
		System.out.println(arrangeCoins);
	}
	
	@Test
	public void test1() {	
		int n=5;
		int arrangeCoins = arrangeCoins(n);
		System.out.println(arrangeCoins);
	}
	
	public int arrangeCoins(int coins) {
		
		int steps=0;
		
		for(int i=1;i<=coins;i++) {
			steps++;
			coins=coins-steps;
			
		}	
		return steps;
	}
	
}
