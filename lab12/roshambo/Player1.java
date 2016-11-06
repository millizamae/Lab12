package com.lab12.roshambo;
// this is the player that always chooses "ROCK" 

public class Player1 extends Player {

	@Override
	public void name() {
		System.out.println("You have chosen, Rocky!");
		
	}

	@Override
	public Roshambo value() {
		return Roshambo.ROCK; 
		
	}
	
		
	}
	