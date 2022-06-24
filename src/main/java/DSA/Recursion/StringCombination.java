package DSA.Recursion;

import java.util.stream.Stream;

public class StringCombination {

	private static StringBuilder resultString = new StringBuilder();
	static String str = "2345";

	public static void main(String[] args) {

		
//		String str = "2,3,4,5";
//		String plainStr = str.substring(1, str.length()-1); // clear braces []
//		String[] parts = str.split(",");
//		int[] inputArr = Stream.of(parts).mapToInt(Integer::parseInt).toArray();
		
		// int nums[] = { 2, 3, 4, 5 };
		int start = 0;
		getCombination(start);
	}

	public static void getCombination(int beg) {
		for (int i = beg; i < str.length(); ++i) {
			resultString.append(str.charAt(i));
			System.out.println(resultString);
			if (i < str.length()) {
				getCombination(i + 1);
			}
			int currLen = resultString.length() - 1;
			resultString.setLength(currLen);
		}
	}

}
