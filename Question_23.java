package lab4;

import java.util.Arrays;

public class Question_23 {

	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(fizzArray(8)));
	}
	
	public static int[] fizzArray(int x) {
		
		int[] array = new int[x];
		
		for(int i=0;i<array.length;i++) {
			array[i]=i;
		}
		
		return array;
		

	}

}
