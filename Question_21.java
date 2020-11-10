package lab4;


public class Question_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {2, 3, 2, 2, 4, 2} ;// = > true
		int[] x1 = {2, 3, 2, 2, 4, 2, 2} ; // = > false
		int[] x2 = {1, 2, 3, 4} ; //= > false
		
		
		System.out.println(sum28(x));
		
		
	}

	public static boolean sum28 (int [] arr) {
		
		int sum =0;
		
		for (int i=0; i< arr.length; i++) {
			
			if(arr[i]==2) {
				
				sum= sum + arr[i];
			}	
		}
		
		if (sum == 8) {
			return true;
		}
		return false;
		
	}
	
	
	
}
