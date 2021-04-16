
//WAP TO PRINT MULTIPLICATION TABLE


package loops;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Input a number for tabel :");
		
		byte number = reader.nextByte();
		
		System.out.println("Table of "+ number + " is -");
		for(int i=1; i<=10; i++) {
			
			System.out.println(number*i);
		}

	}

}
