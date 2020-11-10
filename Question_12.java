package lab4;

public class Question_12 {

	public static void main(String[] args) {
		
		int[] x = {0,2,3};
		int[] y = {1,3};
		
		int[] a = {1,2,3};
		int[] b = {1,3};
		
		
		System.out.println(start1(x, y));
		System.out.println(start1(a, b));
		

	}

	public static int start1(int [] arr1 , int [] arr2) {
		
		int counter=0;
		
		if(arr1[0]==1) {
			counter++;
		}
		
		if(arr2[0]==1) {
			counter++;
		}
		return counter;
	}
	
	
	
}
