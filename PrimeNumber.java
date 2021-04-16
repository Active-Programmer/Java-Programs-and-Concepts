
//WAP TO CHECK WHETHER A NUMBER IS PRIME OR NOT

package loops;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Input Data :");
		
		int num = reader.nextInt();
		
		boolean result = true;
		
		if (num == 1) {
			
			result = false;
			
			System.out.println("Not Prime");
		}
		
		else {
		
			for(int i=2;i<num;i++) {
				
				if(num % i == 0) {
					
					result = false;
					System.out.println("Not Prime");
					break;
				}
			}
		}
			
		if(result == true) {
			System.out.println("Prime");
//		
		}
			
			
		

	}

}
