package lab4;

import java.util.Arrays;

public class Question_6 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3}; //= > [3,3,3]
		int[] y = {11,5,9}; //= > [11,11,11]
		int[] a = {110,5,98,0,1200,11,-4}; 
		//= > [1200,1200,1200,1200,1200,1200,1200]
		int[] m = {1,20,3,0,0,0,0,0,0,0,125};
		
		System.out.println(Arrays.toString(maxEnd(x)));
		System.out.println(Arrays.toString(maxEnd(y)));
		System.out.println(Arrays.toString(maxEnd(a)));
		System.out.println(Arrays.toString(maxEnd(m)));

	}

	public static int [] maxEnd(int [] arr) {
		
		int max= arr[0];
		
		for(int i=0; i<arr.length-1;i++) {
			if(arr[i+1]>max) {
				max=arr[i+1];
				
			}
		}
		for (int i=0; i<arr.length;i++) {
			
			arr[i]=max;
		}
		return arr;
		
}	
}
