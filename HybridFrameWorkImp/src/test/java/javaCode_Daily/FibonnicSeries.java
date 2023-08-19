package javaCode_Daily;

public class FibonnicSeries {

	public static void main(String[] args) {

		int num = 5;
		int a = 0, b = 1;
		int c = 0;

		System.out.println("Fibonnic Series:");

		if (num == 0) {
			System.out.println(a);
		} else {
			System.out.print(a + " " + b);
		}
		if (num != 0) {

			for (int i = 0; i <= num; i++) {
				c = a + b;
				System.out.print(" " + c);
				a = b;
				b = c;
			}

		}
	}

}
