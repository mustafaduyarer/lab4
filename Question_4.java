package lab4;

public class Question_4 {

	public static void main(String[] args) {
		
         int[] x = {1,2,3};
         int[] y = {-4,2,0};
         int[] z = {5,6,9,22,55,4,2,0};
         int[] o = {3,-2,10,4}; //= > 15
		
		int a=sum(x); //aynı alttatkiyle
		System.out.println(a);
		System.out.println(sum(y));
		System.out.println(sum(z));
		System.out.println(sum(o));
	}

	public static int sum(int [] array) {
		int sum=0;
		
		for( int value : array) {
			sum=sum+value;
						
		}
		return sum;
		
	}
	
}
