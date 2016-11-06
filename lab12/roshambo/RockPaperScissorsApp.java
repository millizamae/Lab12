package com.lab12.roshambo;

import java.util.Scanner;

public class RockPaperScissorsApp {

	public static void main(String[] args) {

		// initialize variables
		Scanner scan = new Scanner(System.in);
		int win = 0;
		int games = 0;
		String answer = "y";
		int opp = 0;
		int rps = 0;
		int wins = 0;
		Roshambo oppChoice = null;
		int loss = 0;
		int lose = 0;
		Player1 player1 = new Player1();
		Player2 player2 = new Player2();
		Player3 player3 = new Player3();
		

		// Welcome player and explain
		System.out.println("Let's Play: Rock, Paper, Scissors!!");
		System.out.println("In this game you'll get to select your opponent and then choose Rock, Paper, or Scissors");
		// loop to beging repeat cycle
		while (answer.equalsIgnoreCase("y")) {
			// output choices for player and R/P/S, gather player choices in 2
			// loops for validation
			System.out.println("Please choose your opponent by number: 1: Rocky" + "\t" + "2: Rando"
			 + " 3: Create a Player");
			opp = scan.nextInt();

			opp = RpsValidation.opp(opp);
			if (opp == 1) {
				player1.name();
			 } else if ( opp ==2 ){
				player2.name();
			 } else if (opp == 3) {
					player3.name();

				// Output player selection if/else
			}
			// RPS loop with validation
			System.out.println("Please choose by number: 1: Rock" + "\t" + "2: Paper" + "\t" + "3:Scissors");
			rps = scan.nextInt();
			rps = RpsValidation.rps(rps);
			// call computer player roshambo

			if (opp == 1) {
				oppChoice = player1.value();
			} else if  (opp == 2){
				oppChoice = player2.value();
			} else if (opp == 3 ){
				oppChoice = player3.value();
			}

			// determine and track winner and game played
			// String oppChoice = "Rock";
			// String oppChoice2 = "paper";
			// String oppchoice3 = "scissors";
			int draw = 0;
			lose = 0;

			if (rps == 1) {
				switch (opp) {
				case 1:
					oppChoice.equalsIgnoreCase("rock");
					draw++;
					System.out.println("You chose Rock and that doesn't beat Rock. It's a Draw.");
					break;
				case 2:
					oppChoice.equalsIgnoreCase("paper");
					lose++;
					System.out.println("You chose Rock and that doesn't beat Paper. You Lose.");
					break;
				case 3:
					oppChoice.equalsIgnoreCase("scissors");
					win++;
					System.out.println("You chose Rock and that beats Scissors. You Win!");
					break;
				}
			} else if (rps == 2) {
				switch (opp) {
				case 1:
					oppChoice.equalsIgnoreCase("rock");
					win++;
					System.out.println("You chose Paper and that beats Rock. You Win!");
					break;
				case 2:
					oppChoice.equalsIgnoreCase("paper");
					draw++;
					System.out.println("You chose Paper and that doesn't beat Paper. It's a Draw.");
					break;
				case 3:
					oppChoice.equalsIgnoreCase("scissors");
					lose++;
					System.out.println("You chose Paper and that doesn't doesn't beat Scissors. You've Lost.");
					break;
				}
			} else if (rps == 3) {
				switch (opp) {
				case 1:
					oppChoice.equalsIgnoreCase("rock");
					lose++;
					System.out.println("You chose Scissors and that doesn't beat Rock. You've Lost.");
					break;
				case 2:
					oppChoice.equalsIgnoreCase("paper");
					win++;
					System.out.println("You chose Scissors and that beats Paper. You Win!");
					break;
				case 3:
					oppChoice.equalsIgnoreCase("scissors");
					draw++;
					System.out.println("You chose Scissors and that ties Scissors. It's a Draw.");
					break;

				}

			}

			// Game result output

			// System.out.println("You chose rpschoice" + " that does/doesnt
			// beat" + " compchoice." + " You've: " + "won/lost" );
			games++;
			if (win == 1) {
				wins++;
				// System.out.println(wins);
			} else if (lose == 1)
				loss++;

			lose = 0;
			win = 0;
			// output continue options
			System.out.println("Would you like to play again? Please enter y or n:");
			answer = scan.next();
			// Validate continue options
			answer = RpsValidation.answer(answer);

		}
		// ouput Games / Wins / win % and closing
		System.out.println("You played " + games + " and won " + wins + " and lost " + loss + " of them.");
		System.out.println("Thank you for playing and have a wonderful day.");
		scan.close();
	}

}
