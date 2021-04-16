
//WAP TO FIND SUM OF NATURAL NUMBER

package loops;
import java.util.Scanner;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Input a natural number :");
		
		int number = reader.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<=number; i++) {
			
			sum = sum + i;
		}
		
		System.out.println("The Result is "+sum);
				
	}

}
