package loops;
import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows :");
		int rows = sc.nextInt();
		
		int k=0;
		
		for(int i=1;i<=rows;i++) {
			if(i<=rows-4) {
				k++;
			}
			else {
				k--;
			}
			for(int j=1;j<=rows-3;j++) {
				if(j<=k) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}

	}

}
