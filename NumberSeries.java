
//WAP TO PRINT SUM OF SERIES

package loops;
import java.util.Scanner;

public class NumberSeries {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Input last digit :");
		int num = reader.nextInt();
		
		float result = 1f;
		
		if(num == 0) {
			System.out.println(0);
		}
		
		else if(num == 1) {
			System.out.println(1);
		}
		
		else {
			
			for(int i=2; i<=num; i++) {
				
				result =  result + ((float)1/i);
			}
			
			System.out.println("Sum of the Series is " + result);
		}
		

	}

}
