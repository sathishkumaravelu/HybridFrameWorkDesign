package javaCode_Daily;

public class ParameterizedUnderstanding {

	int id;
	String name;

	public ParameterizedUnderstanding(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		ParameterizedUnderstanding S1 = new ParameterizedUnderstanding(111, "Sathish");
		S1.display();
		ParameterizedUnderstanding S2 = new ParameterizedUnderstanding(112, "Harleen");
		S2.display(); 
	}

}
