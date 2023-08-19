package javaCode_Daily;

import java.util.Set;
import java.util.TreeSet;

public class SetProgram {

	public static void main(String[] args) {

		Set<String> st1 = new TreeSet<String>();

		st1.add("apple");
		st1.add("banana");
		st1.add("cherry");

		boolean value = st1.contains("apple");
		boolean value1 = st1.contains("date");

		if (value == true && value1 == true) {
			System.out.println("Word already exists in the set");

		} else if (value == false) {
			st1.add("apple");
		} else if (value1 == false) {
			st1.add("date");
			System.out.println("Word added in the set");

		}
	}
}
