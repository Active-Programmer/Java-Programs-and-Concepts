package multiplyTwoNums;
import java.util.Scanner;

public class MultiplyTwoNums {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number 1:");
		float numOne = sc.nextFloat();
		
		System.out.print("Input Number 2:");
		float numTwo = sc.nextFloat();
		
		float result = numOne * numTwo;
		
		System.out.print("Multiplication is " + result);
	}

}
