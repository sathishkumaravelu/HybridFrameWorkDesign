package javaCode_Daily;

public class UnderstandingClassNdObject {

	int rollno;
	String name;

	void insetRecord(int r, String n) {
		rollno = r;
		name = n;
	}

	void displayInformation() {
		System.out.println(rollno + " : " + name);
	}
}

class TestStudent {
	public static void main(String[] args) {
		UnderstandingClassNdObject s1 = new UnderstandingClassNdObject();
		s1.insetRecord(100, "Sathish");
		s1.displayInformation();
		s1.insetRecord(101, "Harleen");
		s1.displayInformation();
	}

}
