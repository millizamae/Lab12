package com.lab12.roshambo;

import java.util.Random;
import java.util.Scanner;

public class Player2 extends Player {

	@Override
	public void name() {
		System.out.println("You have chosen Rando Calrissian");

	}

	@Override
	public Roshambo value() {
		
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int randomNumber = 0;
		randomNumber = rnd.nextInt(3) + 1;
		// System.out.println("player 2" + randomNumber);
		Roshambo oppChoice = null;

		if (randomNumber == 1) {
			System.out.println("Rando chooses " + Roshambo.ROCK + ".");
			oppChoice = Roshambo.ROCK;
		} else if (randomNumber == 2) {
			System.out.println("Rando chooses " + Roshambo.PAPER + ".");
			oppChoice = Roshambo.PAPER;
		} else if (randomNumber == 3) {
			System.out.println("Rando chooses " + Roshambo.SCISSORS + ".");
			oppChoice = Roshambo.SCISSORS;
		}
		return oppChoice;

	}
}


