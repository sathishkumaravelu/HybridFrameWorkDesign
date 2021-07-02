package programJava;

public class WordCount {

	public static void main(String[] args) {

		String text = "selenium is the web automation tool, This is the most effective tool for web applications automation.";

		String[] splitText = text.split(" ");
		String[] temp = splitText;

		int count = 0;

		for (int i = 0; i < splitText.length; i++) {
			for (int j = 1; j < splitText.length; j++) {

				if (splitText[i].equalsIgnoreCase(temp[j])) {

					count++;

					System.out.println("The repeated text is " + splitText[j] + " and the count is" + count);
				
				}
			}

		}

	}

}
