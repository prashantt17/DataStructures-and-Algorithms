package DSA.Recursion;

public class Find_Numbers_with_Even_Number_of_Digits {

	public static void main(String[] args) {
		
		int nums[] = { 555, 901, 482, 1771 };
		int result = findNumbers(nums);
		System.out.println("result : " + result);
	}
	
	 public static int findNumbers(int[] nums) {
	        int evenCount = 0;
	        for (int i = 0 ; i < nums.length ; i++) {
	            int count = 0; 
	            calculateDigit(nums[i], count);
	            evenCount = (count %2 == 0) ? evenCount++ : evenCount;
	        }
	        
	        return evenCount;
	    }
	    
	    private static void calculateDigit (int num, int count) {
	        if (num == 0) {
	            return;
	        }
	       
	        
	        num = num / 10;
	        count++;
	        calculateDigit(num, count);
	        
	    }

}
