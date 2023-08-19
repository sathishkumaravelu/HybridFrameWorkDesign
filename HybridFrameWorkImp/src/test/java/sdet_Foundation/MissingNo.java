package sdet_Foundation;

import java.util.Arrays;
import java.util.Iterator;

public class MissingNo {

	public static void main(String[] args) {

		
		int [] num = new int []  {9,6,4,2,3,5,7,0,1};  
		int size =num.length;
		//System.out.println(size);
		Arrays.sort(num);
		for(int i=0;i<=size;i++) {
			
			if(i==size) {
				System.out.println(i);
			}else if(num[i]!=i) {
				System.out.println(i);
				break;
			}else {
				
				
			}
		}
		
	}

}
;

