package loops;
import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Number 1 :");
		
		int numberOne = sc.nextInt();
		
		System.out.println("Input Number 2:");
		
		int numberTwo = sc.nextInt();
		
		System.out.println("Input the operation :");
		
		char operation = sc.next().charAt(0);
		
		int result = 0;
		
		switch(operation) {
		
		case '+':
			result = numberOne + numberTwo;
			break;
			
		case '-':
			result = numberOne - numberTwo;
			break;
			
		case '*':
			result = numberOne * numberTwo;
			break;
			
		case '/':
			result = numberOne / numberTwo;
			break;
			
		default:
			System.out.println("invalid operation!!");
		}
		
		System.out.println("The Result is " + result);
		
				
	}