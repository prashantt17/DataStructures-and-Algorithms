package DSA.Recursion;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Prashant";
		String result = reverseString(str);

		System.out.println(result);
	}

	public static String reverseString(String s) {

		if (s.length() == 0) {
			return s;
		} else {
			return reverseString(s.substring(1)) + s.charAt(0);
		}
	}
}
