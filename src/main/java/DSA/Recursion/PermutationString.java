package DSA.Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class PermutationString {

	public static void main(String[] args) {

		String str = "2,3,4,5";
		String[] parts = str.split(",");
		int[] inputArr = Stream.of(parts).mapToInt(Integer::parseInt).toArray();

		Set<List<Integer>> set = findCombinations(inputArr);

		for (List<Integer> al : set) {
			System.out.println(al);
		}
	}

	public static void findCombinations(int[] A, int i, int k, Set<List<Integer>> subarrays, List<Integer> out) {
		if (A.length == 0 || k > A.length) {
			return;
		}

		if (k == 0) {
			subarrays.add(new ArrayList<>(out));
			return;
		}

		for (int j = i; j < A.length; j++) {
			out.add(A[j]);
			findCombinations(A, j + 1, k - 1, subarrays, out);
			out.remove(out.size() - 1);
		}
	}

	public static Set<List<Integer>> findCombinations(int[] A) {
		Set<List<Integer>> subarrays = new HashSet<>();
		int k = 1;
		while (k < A.length) {
			findCombinations(A, 0, k++, subarrays, new ArrayList<>());
		}

		return subarrays;
	}

}
