package lab4;

public class Question_24 {

	public static void main(String[] args) {
		
		int[] x = {1,2,1,3,2,7,2};
		int a = 2;
		
		System.out.println(isEveryWhere(x, a));
		

	}

	public static boolean isEveryWhere(int [] arr, int number) {
		
		for(int i=0; i<arr.length-2; i++) {
			
			if(arr[i]==number && (arr[i+1]==number || arr[i+2]==number)) {
				return true;
			
			}
			
		}
		return false;
	}
}
