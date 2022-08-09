package DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class MaxFromList {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		nums.add(12);
		nums.add(10);
		nums.add(1);
		nums.add(42);
		nums.add(4);
		nums.add(42);
		nums.add(54);
		nums.add(14);
		nums.add(32);
		int max = findMaxValue(nums, 0);
		System.out.println("Max Value : " + max);
	}

	public static int findMaxValue(List<Integer> nums, int idx) {

		if (idx == nums.size()) {
			return 0;
		}

		int max = findMaxValue(nums, idx + 1);
		if (max > nums.get(idx)) {
			return max;
		} else {
			return nums.get(idx);
		}

	}

}
