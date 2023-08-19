package javaCode_Daily;

import java.util.Iterator;

public class getStringCount {

	public static int count = 1 ;
	public static int getStringCountNo(String STR) {
		
		
		
		char[] strCharArray = STR.toCharArray();
		
		System.out.println(strCharArray);
		
			
			for(int i=0; i<strCharArray.length-1;i++) {

				System.out.println(strCharArray[i]);
				
				if(strCharArray[i] ==' ' && strCharArray[i+1] != ' ') {
		            count++;
		        }

			}
			
			
		//}
		return count;

	}
	
	
	public static void main(String[] args) {
		

		getStringCountNo("The quick brown fox jumps over the lazy dog.");
		
		System.out.println(count);
		
		
	}

}
