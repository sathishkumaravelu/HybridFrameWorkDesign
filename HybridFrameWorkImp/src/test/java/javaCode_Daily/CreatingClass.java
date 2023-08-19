package javaCode_Daily;

public class CreatingClass {

	int id,id1=10;
	String name,name1="new value assigned";
	
	public static void main(String[] args) {
	
		CreatingClass S1 = new CreatingClass();
		System.out.println(S1.id+" "+"\n"+S1.name);
		System.out.println(S1.id1+" "+"\n"+S1.name1);
	}

}
