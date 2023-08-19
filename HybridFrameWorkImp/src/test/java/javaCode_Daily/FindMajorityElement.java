package javaCode_Daily;

import org.junit.Test;

import junit.framework.Assert;

public class FindMajorityElement {

	Integer candidate = null;
	int count = 0;

	
	@Test
	public void test1() {
		int[] nums = {2, 4, 5, 2, 2, 2, 3};
		Integer result = findMajorityElement(nums);
		if(result != null) {
			System.out.println(candidate);
		}else {
			System.out.println("no majority element");
		}
	}

	
	
	
	public Integer findMajorityElement(int[] nums) {

		for (int num : nums) {

			if (count == 0) {
				candidate = num;
				count++;
			} else if (count == num) {
				count++;
			} else {
				count--;
			}

		}

		count = 0;
		for (int num : nums) {
			if (num == candidate) {
				count++;
			}
		}

		if (count > nums.length / 2) {
			return candidate;
		}
		return null;
	}

}
