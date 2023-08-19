package javaCode_Daily;

public class Check_if_a_Number_is_Positive_or_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Check_if_a_Number_is_Positive_or_Negative obj = new Check_if_a_Number_is_Positive_or_Negative();

		obj.nestedLoop();
		obj.brute_Force();
		obj.terrinaryOperator();
	}

	public void nestedLoop() {
		{
//		    Step 1 – Start
//		    Step 2 – Insert the number.
//		    Step 3 – If the number is greater or equal move to the inner nested loop
//		        Step 3.1 – If the number is zero, print Zero
//		        Step 3.2 – Else print The Number is Positive
//		    Step 4 – Else the number has to be negative, Print The number is Negative
//		    Step 5 – Stop

			int num = 22;
			// Condition to check if the number is negative or positive
			if (num >= 0) {
				if (num == 0)
					System.out.println("Zero");
				else
					System.out.println("The number is positive");
			} else
				System.out.println("The number is negative");

		}
	}

	public void brute_Force() {
//		This method uses Brute Force to check whether a given integer is Positive or Negative. The Algorithm for the above code is as follows
//
//	    Step 1. Start
//	    Step 2. Insert the number.
//	    Step 3. If the number is greater than Zero then print “The number is Positive”
//	    Step 4: If the number is smaller than zero, then print, “The number is Negative”
//	    Step 5. Else print, “The number is Zero”
//	    Step 6. Stop

		int num = -1;

		// Conditions to check if the number is negative or positive
		if (num > 0)
			System.out.println("The number is positive");
		else if (num < 0)
			System.out.println("The number is negative");
		else
			System.out.println("Zero");
	}

	public void terrinaryOperator() {

//	    Step 1 – Start
//	    Step 2 – Insert the number.
//	    Step 3 – If number is equal to zero, Print Number is Zero
//	    Step 4 – Else do following – (num > 0) ? cout << “Positive”: cout << “Negative”;
//	    Step 5 – Stop

		int num = 0;

		// Condition to check if the number is negative or positive

		if (num == 0) {
			System.out.println("Zero");
		}

		else {
			String result = num > 0 ? "The number is positive" : "The number is negative";
			System.out.println(result);
		}
	}

}
