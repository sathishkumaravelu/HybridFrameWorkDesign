package javaCode_Daily;

public class AmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int original = num;
		int result = 0,temp;
		
		while(num>0) {
			
			temp = num%10;
			num= num/10;
			result = result +(temp*temp*temp);
		}
		System.out.println(result);
		if(result==original) {
			System.out.println("Its an amstrong no");
		}else {
			System.out.println("its not a amstrong no");
		}
		
	}
}