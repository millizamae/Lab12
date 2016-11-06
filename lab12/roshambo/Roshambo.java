package com.lab12.roshambo;

public enum Roshambo {
ROCK ("Rock"),
PAPER ("Paper"),
SCISSORS ("Scissors");

	private String roshType;
	
	private Roshambo (String endRosh) {
		this.roshType = endRosh;
	}
	@Override
	public String toString(){
		return roshType;
	}
	public void equalsIgnoreCase(String roshType) {
	
		
	}
}
