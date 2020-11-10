package lab4;

public class Question_3 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = {7,3};
		int[] d= {1,3,4,7,3};
		int[] e= {7,3,6,8,9};
		int[] s = {3};
		int[] m = {7};
		
		
		System.out.println(commonEnd(a,b));
		System.out.println(commonEnd(a,m));
		System.out.println(commonEnd(d,e));
		System.out.println(commonEnd(s,m));
		
		
		
	}
	
	public static String commonEnd(int[] x, int[] y) {
		
		if(! (x.length>1)) {
			return "Array 1 is not valid";
		}
		
		if(! (y.length>1)) {
			return "Array 1 is not valid";		
		}
		if(x[0]== y [0] || x[x.length-1]  == y[y.length-1]) {
			return "true";
			
		}else {
			return "false";
		}
		
		
		
}

}
