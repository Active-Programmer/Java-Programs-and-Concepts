package vowelConstant;
import java.util.Scanner;

public class VowelConstant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input Data : ");
		char data = sc.next().charAt(0);
		
		if (data == 'a' || data == 'e' || data == 'i' || data == 'o' || data == 'u') {
			
			System.out.print("Vowel!!");
		}
		
		else {
			
			System.out.print("Consonant!!");
		}

	}

}
