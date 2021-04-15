
//Swapping Two Numbers using Third variable

package swapNumbers;
import java.util.Scanner;

public class SwapValues {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
	
		System.out.print("Input No. 1 :");
		byte numberOne = sc.nextByte();
		
		System.out.print("Input No. 2 :");
		byte numberTwo = sc.nextByte();
		
//		Swapping Algorithm
		
		byte temp = numberOne;
		numberOne = numberTwo;
		numberTwo = temp;
		
		System.out.println("After Swapping - ");
		System.out.println("Number 1 : "+numberOne);
		System.out.print("Number 2 : "+numberTwo);
		
		
				
		
	}

}
