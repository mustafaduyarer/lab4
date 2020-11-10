package lab4;

public class Question26 {

	public static void main(String[] args) {
		
		int[] x = {10,3,5,6};
		int[] z= {2,4,2,5}; //true
		
		System.out.println(modThree(x));
		System.out.println(modThree(z));

	}
	public static boolean modThree(int[] nums) {
		  for(int i=0;i<nums.length-2;i++){
		    if((nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0)||(nums[i]%2==1 && nums[i+1]%2==1 && nums[i+2]%2==1)){
		      return true;
		    }
		  }
		    return false;
		}
	
}
