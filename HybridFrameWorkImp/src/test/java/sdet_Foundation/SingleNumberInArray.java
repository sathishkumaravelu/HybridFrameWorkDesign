package sdet_Foundation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.parser.Entity;

import org.junit.Test;

import junit.framework.Assert;

public class SingleNumberInArray {

	@Test
	public void test1() {

		int[] input = { 1, 1, 2, 3, 3 };

		int checkUniqueNo = checkUniqueNo(input);
		System.out.println(checkUniqueNo);
		
		Assert.assertEquals(2, checkUniqueNo);
	}

	public int checkUniqueNo(int[] input) {

		HashMap<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < input.length; i++) {

			if (inputMap.containsKey(input[i])) {
				int value = inputMap.get(input[i]);
				inputMap.put(input[i], value + 1);

			} else {

				inputMap.put(input[i], 1);
			}

		}

		System.out.println(inputMap);
		for (Map.Entry<Integer, Integer> eachEntry : inputMap.entrySet()) {
			if (eachEntry.getValue() == 1) {
				count = eachEntry.getKey();
			}
		}
		return count;
	}
}
