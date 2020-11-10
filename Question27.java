package lab4;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int positions = input.nextInt();
		int[] myarray = new int[positions];

		for (int x = 0; x < myarray.length; x++) {
			myarray[x] = input.nextInt();
		}

		boolean state = tripleUp(myarray);
		System.out.println(state);
	}

	public static boolean tripleUp(int [] myarray) {
		boolean triple = false;

		for (int y = 0; y < myarray.length -2; y++){
			if (myarray[y] == myarray[y + 1] - 1 && myarray[y] == myarray[y + 2] - 2){
				triple = true;
				break;
			}
		}

		return triple;
		

	}

}
