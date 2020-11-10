package lab4;

public class Question_19 {

	public static void main(String[] args) {
		int[] a1 = {1, 2, 2, 6, 99, 99, 7,1,2} ;//= > 5
		int[] y = {1, 2, 2, 6, 99, 99, 7};//  = > 5
		int[] a = {1,1,6,7,2} ; //= > 4
		int[] b = {1,1,6,2} ; //= > 2
		int[] x = {1,2,2,6,99,99,7,3,4}; // = > 12
		
		int sum=0;
		
		boolean boolCheckSix= false;
		
		for(int i=0; i<x.length; i++) {
			
			if(boolCheckSix) {
				      
			            	if(x[i] == 7) {
				    	  
				    	  boolCheckSix = false;
				          }
				   
			
				
			}else if (x[i]==6) {
				
				boolCheckSix = true;
				
			}else {
				
				sum= sum + x[i];
			}
		}
			System.out.println(sum);	

	}

}
