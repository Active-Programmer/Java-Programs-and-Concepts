package aSCIIValue;
import java.util.Scanner;

public class ASCIIValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Any character (A-Z):");
		
		char letter = sc.next().charAt(0);
		
		int c = (int)letter;
		
		System.out.println("ASCII Value is " + c);
		
		
		
	}

}
