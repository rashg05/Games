package com.bridgelab.snakeandladder;

public class RandomAddedUC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int points = 0;
		System.out.println("So, lets start the game with position " + points);
		int die_roll = (int)(Math.floor(Math.random() * 10) % 6) + 1; 
		System.out.println("Die giving you your lucky number: " + die_roll);
	}

}
