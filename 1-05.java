//Created By: Nicholas Brean
//Created On: September 2018
//The game will generate a random number between 1 and 6. 
//It will then ask the user to guess the number and will keep track 
//of the number of guesses until the user gets the right answer. It will then tell the user how many guesses it took

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	public static void main(String args[]){
		
		int userchoice; 
		int userGuessCount = 1;
		Scanner userinput = new Scanner(System.in);
		int ComputerGen = new Random().nextInt(6) +1;
		System.out.println("This is a game where you try to guess the number the computer generated. ");
		System.out.println();
		System.out.print("Choose a number between 1-6: ");
		do {
			userchoice = userinput.nextInt();
			if (userchoice == ComputerGen){
				System.out.println("You got it!");
				System.out.print("It took you " + userGuessCount + " guesses to get the right answer." );
				System.exit(0); 
			}else{
				System.out.println("Try again. ");
				userGuessCount = userGuessCount + 1;
			}  
		} while (true);	
	}	
}

		
	


