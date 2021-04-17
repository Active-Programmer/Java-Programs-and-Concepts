
// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         * 

package loops;
import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Input for Rows and Colums :");
		int rows = reader.nextInt();
		
//		LOGIN FOR PATTERN
		
		for(int j=1;j<=rows;j++) {
			for(int i=1;i<=(rows+1)-j;i++) {
				System.out.print("* ");
			}
			System.out.println();
			for(int a =1; a<=j;a++)
				System.out.print("  ");
		}
			
		}

	}


