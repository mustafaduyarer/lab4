package lab4;

public class Question28 {

	public static void main(String[] args) {
		
		int[] x = {5,10}; //→ {5, 6, 7, 8, 9}
		int[] z= {2,4,2,5}; //true
		
		System.out.println(fizzArray3(x));
		

	}
	

	

	public static int[] fizzArray3(int start, int end) {
	    int[] arr = new int[end - start];
	    
	    for(int i = start; i < end; i++)
	        arr[i - start] = i;
	              
	    return arr;
	}

}
