package javaCode_Daily;

public class Even_or_Odd_number {

	public static void main(String[] args) {

		Even_or_Odd_number obj = new Even_or_Odd_number();
		obj.bruceForce();
		obj.binaryOperator();

	}

	public void binaryOperator() {
		{
			int number = 29;

			// Checking if the number is divisible by 2
			String status = number % 2 == 0 ? " is Even" : " is Odd";
			System.out.println(number + status);
		}
	}

	public void bruceForce() {
		int num = 1;

		if (num % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}

	}

}
