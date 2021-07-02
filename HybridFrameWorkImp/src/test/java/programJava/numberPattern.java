package programJava;

public class numberPattern {

	public static void main(String[] args) {

		int row = 4;

		int value = 1;
		int n = 2;

		for (int i = 0; i <= row; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(((value * n) + i) - 1 + " ");

				value++;
			}
			System.out.println();
		}

	}
}
