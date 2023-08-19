package SelfProgram_Daily_17072023;

import org.junit.Test;

public class fibonacciSeries {
/*
 * input int 
 * output series
 * 
 * Test data:
 * 
 * input = 5
 * output = 0 1 1 2 3
 * 
 * input = 10 
 * output = 0 1 1 2 3 5 8 13 21 34
 * 
 * 
 * Psudeo code:
 * 
 * if num =0  print zero
 * if num =1  print 0 1 
 * if num >1 
 * print a , b 
 * int a = 0; b=1;
 * for (i=2;i<=num;i++)
 * 
 * 
 * 
 * 	c= a+b;
 * , print c 
 * 	a=b;
 * b=c;
 * 
 * 
 * 
 */
	
	@Test
	public void test() {
		fiboniccSeries(10);
	}
	
	public void fiboniccSeries(int num) {
		int a=0,b=1,c;
		
		
		if(num==0) {
			System.out.println(0);
		}
		System.out.print(a+" "+b);
		
		for (int i = 2; i <num; i++) {
			c=a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
			
		}
	}
	
	
}
