//WAP to get the sum of three Numbers


package addThreeNumbers;
import java.util.Scanner;

public class addThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input First Number:");
		int first_number = sc.nextInt();
		
		System.out.print("Input Second Number:");
		int second_number = sc.nextInt();
				
		System.out.print("Input Third Number:");
		int third_number = sc.nextInt();
		
		int sum = first_number + second_number + third_number;
		
		System.out.print("Sum is "+ sum);
		

	}

}
