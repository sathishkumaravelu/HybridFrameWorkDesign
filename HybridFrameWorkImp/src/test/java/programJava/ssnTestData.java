package programJava;

import java.util.Random;

public class ssnTestData {

	
	public static void main(String[] args) {
		
		
		long timeSeed = System.nanoTime();
		double randSeed = Math.random() *1000;
		long midSeed = (long)(timeSeed*randSeed);
		
		
		
		
		String s = midSeed+"";
		String ssn = s.substring(0,9);
		String drivingL = s.substring(0,11);
		
		int ssnFinal = Integer.parseInt(ssn);
		
		System.out.println(ssnFinal);
		
		
		String abc = "ABCDEFGHIJKLMNOPQSTRUVWXYZ";
		
		Random rd = new Random();
		
		char letter = abc.charAt(rd.nextInt(abc.length()));
		
		String driverLic = letter+drivingL;
		System.out.println(driverLic);
		
		
		
		
		
		
	}
	
	
	
}
