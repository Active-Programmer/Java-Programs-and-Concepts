
//WAP TO FIND X POWER Y

package loops;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Input Base Value :");
		
		int baseValue = reader.nextInt();
		
		System.out.println("Input Power Value :");
		int powerValue = reader.nextInt();
		
		int result = 1;
		
		for(int i=0; i<powerValue; i++) {
			
			result = result * baseValue;
		}
		
		System.out.println(baseValue + " raise to the power " + powerValue + " is :" +  +result);

	}

}
