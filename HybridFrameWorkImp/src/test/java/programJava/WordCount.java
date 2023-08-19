package programJava;

public class WordCount {

	public static void main(String[] args) {

		String text = "selenium  the web automation tool, This is the most effective tool for web applications the automation";

		String[] splitText = text.split(" ");
		String[] temp = splitText;

		int count ;

		for (int i = 0; i < splitText.length; i++) {
			count = 1;
			for (int j =i+1; j < splitText.length; j++) {

				if (splitText[i].equalsIgnoreCase(temp[j])) {

					count++;
					temp[j]="0";
				}
			}

			if (count > 1 && temp[i]!="0") {

				System.out.println("The repeated text is " + splitText[i] + " and the count is" + count);

			}

		}

	}

}
