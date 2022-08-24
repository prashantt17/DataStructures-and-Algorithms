package DSA.SearchingAndSorting;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 13, 5, 9, 10, 6 };
		Arrays.sort(arr);
		int target = 6;

		// int index = search(arr, 6);
		// System.out.println("Index : " + index);

		int left = 0;
		int right = arr.length - 1;

		int index = searchWithRecursion(arr, left, right, target);
		System.out.println("Index : " + index);
	}

	// Searching Without Recusrion
	public static int search(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (target == arr[mid]) {
				return mid;

			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		return -1;
	}

	// Search With Recursion
	public static int searchWithRecursion(int[] arr, int left, int right, int target) {
		if (left <= right) {
			int mid = (left + right) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target < arr[mid]) {
				right = mid - 1;
				return searchWithRecursion(arr, left, right, target);
			} else {
				left = mid + 1;
				return searchWithRecursion(arr, left, right, target);
			}
		}

		return -1;
	}

}
