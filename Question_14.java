package lab4;

import java.util.Arrays;

public class Question_14 {

	public static void main(String[] args) {
		
        int[] x = {1,2,3};
		
		int[] y = {0,3,4,1,2,4,5,6,7,8,9};
		
		int []k = new int [x.length+ y.length];
		
		for(int i=0; i<x.length;i++) {
			k [i]= x[i];
		}
		
		int a=0;
		for(int j=x.length; j<k.length; j++) {
			
			
			k[j]= y[a];
			a++;
		}
		System.out.println(k.length);
		System.out.println(Arrays.toString(k));
		
		

}
	
}
