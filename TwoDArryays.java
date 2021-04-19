package arrays;

import java.util.Scanner;

public class TwoDArryays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Rows and Colums for matrix A :");
		int rows1 = sc.nextInt();
		int cols1 = sc.nextInt();
		
		System.out.println("Input and Columns for matrix B :");
		int rows2 = sc.nextInt();
		int cols2 = sc.nextInt();
		
		int a[][] = new int[rows1][cols1];
		int b[][] = new int[rows2][cols2];
		int c[][] = new int[rows1][cols2];
		
		if(cols1 == rows2) {
			
			System.out.println("Input Matrxi A :");
			for(int i = 0; i<rows1; i++) {
				for(int j=0; j<cols1; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Input Matrix B :");
			
			for(int i = 0; i<rows2; i++) {
				for(int j = 0; j<cols2; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			System.out.println("Multiplication Result Matrix:\n");
			
			for(int i=0; i<rows1; i++) {
				for(int j=0; j<cols1; j++) {
					for(int k = 0;k<rows1;k++) {
						c[i][j] += a[i][k]*b[k][j];
						
					}
				System.out.print(c[i][j] + " ");
					
				}
				
				System.out.println();
			}
		}
		
		else {
			System.out.println("Muliplication Not Possible");
		}
		
		
		
	}

}
