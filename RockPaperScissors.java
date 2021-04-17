
//THIS IS ROCK PAPERS SCISSORS GAME
//CHOOSE R->ROCK, P->PAPER, S->SCISOOR
//ROCK BEATS SCISSOR, PAPER BEATS ROCK, SCISSOR BEATS PAPER.
//YOU CAN PLAY 5 TIMES ON THE GO.

package loops;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println("THIS IS ROCK PAPERS SCISSORS GAME\nCHOOSE R->ROCK, P->PAPER, S->SCISOOR\nROCK BEATS SCISSOR, PAPER BEATS ROCK, SCISSOR BEATS PAPER.\nYOU CAN PLAY 5 TIMES ON THE GO.\n");
		int min = 0;
		int max = 2;
		
//		USER INPUT
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		while(i<=5)
		{
			
		
			System.out.println("Input Your Call :");
			char userCall = sc.next().charAt(0);
			
	//		COMPUTER INPUT
			List<String> myList = Arrays.asList("R", "P", "S");
			int randomitem = (int)(Math.random()*(max-min+1)+min);
			String randomElement = myList.get(randomitem );
			
			if (userCall == 'R' || userCall == 'r'){
				System.out.println("You Choose :" + userCall);
				if (randomElement == "P") {
					System.out.println("Computer Choose:" + randomElement);
					System.out.println("Computer Won!");
				}
				else if(randomElement == "S"){
					System.out.println("Computer Choose:" + randomElement);
					System.out.println("You Won!");
				}
				else {
					System.out.println("Computer Choose:" + randomElement);
					System.out.println("Game Tied!");
				}
			}
			
			else if(userCall == 'P' || userCall == 'p') {
				System.out.println("You Choose :" + userCall);
				if (randomElement == "R") {
					System.out.println("Computer Choose:" + randomElement);
					System.out.println("You Won!");
				}
				else if(randomElement == "S"){
					System.out.println("Computer Choose:" + randomElement);
					System.out.println("Computer Won!");
				}
				else {
					System.out.println("Computer Choose:" + randomElement);
					System.out.println("Game Tied!");
				}
			}
			
			else if(userCall == 'S' || userCall == 's') {
				System.out.println("You Choose :" + userCall);
				if (randomElement == "R") {
					System.out.println("Computer Choose:" + randomElement);
					System.out.println("Computer Won!");
				}
				else if(randomElement == "P"){
					System.out.println("Computer Choose:" + randomElement);
					System.out.println("You Won!");
				}
				else {
					System.out.println("Computer Choose:" + randomElement);
					System.out.println("Game Tied!");
				}
			}
			
			else {
				System.out.println("Wrong Input!");
			}
			
			i+=1;
			System.out.println();
		}
		
		System.out.println("Game Over\nBye!");

	}

}
