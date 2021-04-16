package loops;
import java.util.Scanner;

public class IntegerNumberSeries {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Input last digit :");
		
		int num = reader.nextInt();
		
		float result = 0;
		
		for(int i=1; i<=num; i++) {
			
			if(i % 2 == 0) {
				result = result - ((float)1/i);
			}
			else {
				result = result + ((float)1/i);
			}
		}
		
		System.out.println(result);
		

	}

}
