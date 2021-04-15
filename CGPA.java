//WAP to calculate CGPA of three subjects where marks are obtained out of 100


package CGPA;
import java.util.Scanner;

public class CGPA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Marks in Subject 1:");
		float subjectOne  = sc.nextFloat();
		
		System.out.print("Input Marks in Subject 2:");
		Float subjectTwo = sc.nextFloat();
				
		System.out.print("Input Marks in Subject 2:");
		float subjectThree = sc.nextFloat();
		
		float totalMarks = subjectOne + subjectTwo + subjectThree;
		
		float CGPA = (totalMarks/300)*100;
		
		System.out.print("Your CGPA is " + CGPA);
		

	}

}
