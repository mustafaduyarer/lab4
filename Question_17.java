package lab4;

public class Question_17 {

	public static void main(String[] args) {
		
		int[] x = {10,3,5,6}; // = > 7
		int[] y = {7,2,10,9}; //  = > 8
		int[] z= {2,10,7,1};  // = > 8

		System.out.println(difference(x));
		System.out.println(difference(y));
		System.out.println(difference(z));

		
	}
	public static int difference(int[] arr) {
		
		//finding the biggest
		int max =0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]> max) {
				max=arr[i];
				
			}
		}
		//finding the smallest
				int min = max;
				for(int i=0; i<arr.length; i++) {
					
					if(arr[i]< min) {
						min=arr[i];
						
					}
				}
				return max-min;
}
}
