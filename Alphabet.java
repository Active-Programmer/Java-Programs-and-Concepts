package loops;
import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Input the Data :");
		
		char letter = reader.next().charAt(0);
		
		if( (letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
			
			System.out.println(letter + " is a Character");
		}
		
		else {
			
			System.out.println(letter + " is not Character");
		}
		
		

	}

}
