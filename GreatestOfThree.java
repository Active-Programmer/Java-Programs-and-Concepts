
//WAP TO CHECK THE GREATEST NUMBER AMONG THE THREE NUMBERS

package loops;
import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Input No. 1:");
		int numberOne = reader.nextInt();
		
		System.out.println("Input No. 2:");
		int numberTwo = reader.nextInt();
		
		System.out.println("Input No. 3:");
		int numberThree = reader.nextInt();
		
		int result = 0;
		
		if(numberOne == numberTwo && numberTwo == numberThree) {
			System.out.println("All the numbers are Same");
			result = numberOne;
		}
		
		else if (numberOne>numberTwo) {
			
			if(numberOne>numberThree) {
				result = numberOne;
			}
			else {
				result = numberThree;
			}
		}
			
		else {
			if(numberTwo>numberOne) {
				if(numberTwo>numberThree) {
					result = numberTwo;
						
					}
				else {
					result = numberThree;
				}
				}
			}
		
		System.out.println(result + " is greater");
		}

	}


