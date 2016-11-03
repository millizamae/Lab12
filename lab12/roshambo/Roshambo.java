package com.lab12.roshambo;

public enum Roshambo {
ROCK ("rock"),
PAPER ("paper"),
SCISSORS ("scissors");

private String roshChoice;
	
private Roshambo(String choice){
	this.roshChoice = choice; 
}

@Override 
public String toString() {
	return roshChoice; 
}
}

