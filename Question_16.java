package lab4;

public class Question_16 {

	public static void main(String[] args) {
		    int[] x = {2,1,2,3,4,7} ;//= > 3
		    int[] y = {2,2,0}; // = > 3
			int[] z= {1,3,5}; //= > 0
			
			System.out.println(countEvens(x));
			System.out.println(countEvens(y));
			System.out.println(countEvens(z));

	}
 public static int countEvens(int [] arr) {
	 int counter=0;
	 
	 for(int value : arr) {
		 if(value %2==0) {
			 counter++;
			 
		 }
		 
	 }
	 return counter;
 }
}
