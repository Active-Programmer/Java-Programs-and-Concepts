
//WAP TO FIND FACTORIAL OF A NUMBER

package loops;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Input a Number :");
		
		int number = reader.nextInt();
		
		int factorial = 1;
		
		for(int i=1;i<=number;i++) {
			factorial = factorial * i;
		}
		
		System.out.println("The Factorial of " + number + " is " +factorial);
	}

}
