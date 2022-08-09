package DSA.Trees;

public class exceptiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = result();
		System.out.println("RESULT : " + a);
	}

	
	public  static int result () {
		try {
			int a = 10/0;
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			//return 3;
		}
	}
}
