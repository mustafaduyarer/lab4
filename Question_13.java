package lab4;

import java.util.Arrays;

public class Question_13 {

	public static void main(String[] args) {
		
		int[] x = {1,6};
		int[] y = {3,4};
		
		int[] a = {1,2} ;   int[] b={3,4}  ;  // = > [3,4]
		int[]  s= {9,6} ;   int[] k = {3,8} ; //= > equal 
		int[] l = {1,1}  ;  int[] m = {1,1} ;// = > [1,1]
		
		biggerTwo(x,y);
		biggerTwo(a,b);
		biggerTwo(s,k);
		biggerTwo(l,m);
		

	}
   public static void biggerTwo(int []arr1, int [] arr2) {
	   
	   int sum1=0;
	   int sum2=0;
	   
	   for(int value : arr1) {
		   sum1=sum1+value;
		   
	   }
	   
	   for(int value : arr2) {
		   sum2=sum2+value;   
   }
	
	   if(sum1>sum2) {
		   System.out.println(Arrays.toString(arr1));
	   }else if ((sum2>sum1)){
		   System.out.println(Arrays.toString(arr2));
	   }else {
		   System.out.println("Equal");
	   }
	   
	   
	   
	   
	   
}	
}
