package com.lab12.roshambo;

import java.util.Scanner;

public class Player3 extends Player {
Scanner scan = new Scanner(System.in);

	@Override
	public void name() {
		System.out.println("Please enter your Name: ");
		String setName = scan.next();
		System.out.println("Hello " + setName + ".");
	}

	@Override
	public Roshambo value() {
		System.out.println("Please select 1: Rock, 2: Paper or, 3: Scissors by number: ");
		int pChoice = scan.nextInt();
		pChoice = RpsValidation.rps(pChoice); 
	
		
		if (pChoice == 1) {
			System.out.println("You chose " + Roshambo.ROCK + ".");
			return Roshambo.ROCK;
		
		} else if  (pChoice == 2) 
			return Roshambo.PAPER;
		System.out.println("You chose " + Roshambo.PAPER + ".");
		{
		System.out.println("You chose " + Roshambo.SCISSORS + ".");
		return Roshambo.SCISSORS;
		
}
}
}