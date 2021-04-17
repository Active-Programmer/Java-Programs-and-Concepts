



package loops;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Input for Rows and Columns :");
		int rows = reader.nextInt();
		
		for(int j=1; j<=rows; j++) {
			for(int a=1; a<=rows-j; a++) {
				System.out.print("  ");
			}
			for(int i=1; i<=j; i++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
