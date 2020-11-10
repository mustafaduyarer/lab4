package lab4;

import java.util.Arrays;

public class Question_7 {

	public static void main(String[] args) {
	
		int[] x = {1,2,3};  
		int[] y = {}; // = > [1,3]
				
		int[] a = {7,4,6,2,3,66,88,99};
		int[] b = {}; // = > [7,99]
		
		System.out.println(Arrays.toString(makeEnds(x,y)));
		System.out.println(Arrays.toString(makeEnds(a,b)));

	}

	public static int [] makeEnds(int [] arr1, int [] arr2) {
		
		arr2 =new int [2];
		
		arr2 [0]= arr1 [0];
		arr2 [1]= arr1 [arr1.length-1];
		
		return arr2;
		
		
		
		
	}
	
}
