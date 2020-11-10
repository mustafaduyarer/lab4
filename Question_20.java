package lab4;

public class Question_20 {

	public static void main(String[] args) {
	
		int[] x1 = {1,2,2} ; //= > true
		int[] xy= {1, 2, 1,2} ; // = > false
		int[] a = {2,1,2} ; //= > false
		int[] x = {4,2,2,1,2} ; // = > true
		
		boolean flag = false;
		
		for(int i=0; i<x.length-1 ; i++) {
			
			if(x[i]==2 && x[i+1] ==2) {
				flag =true;
				break;
			}
			
		}
		
		
		
		
		if(flag) {
			
			System.out.println(true);
		}else {
			System.out.println(false);
		}
				

	}

}
